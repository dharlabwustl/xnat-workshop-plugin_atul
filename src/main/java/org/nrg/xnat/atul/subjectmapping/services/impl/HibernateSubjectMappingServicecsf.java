/*
 * xnat-workshop: org.nrg.xnat.workshop.subjectmapping.services.impl.HibernateSubjectMappingService
 * XNAT http://www.xnat.org
 * Copyright (c) 2017, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.atul.subjectmapping.services.impl;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntityService;
import org.nrg.xnat.atul.subjectmapping.entities.SubjectMappingcsf;
import org.nrg.xnat.atul.subjectmapping.repositories.SubjectMappingRepositorycsf;
import org.nrg.xnat.atul.subjectmapping.services.SubjectMappingServicecsf;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HibernateSubjectMappingServicecsf extends AbstractHibernateEntityService<SubjectMappingcsf, SubjectMappingRepositorycsf> implements SubjectMappingServicecsf {
    /**
     * {@inheritDoc}
     */
    @Transactional
    @Override
    public SubjectMappingcsf findBySubjectId(final String subjectId) {
        return getDao().findByUniqueProperty("subjectId", subjectId);
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    @Override
    public SubjectMappingcsf findByRecordId(final String recordId, final String source) {
        final Map<String, Object> properties = new HashMap<>();
        properties.put("recordId", recordId);
        properties.put("source", source);
        final List<SubjectMappingcsf> subjectMappingcsfs = getDao().findByProperties(properties);
        if (subjectMappingcsfs == null || subjectMappingcsfs.size() == 0) {
            return null;
        }
        return subjectMappingcsfs.get(0);
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    @Override
    public List<SubjectMappingcsf> findBySource(final String source) {
        return getDao().findByProperty("source", source);
    }
}
