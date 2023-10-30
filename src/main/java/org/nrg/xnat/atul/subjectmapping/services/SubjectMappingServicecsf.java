/*
 * xnat-workshop: org.nrg.xnat.workshop.subjectmapping.services.SubjectMappingService
 * XNAT http://www.xnat.org
 * Copyright (c) 2017, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.atul.subjectmapping.services;

import org.nrg.framework.orm.hibernate.BaseHibernateService;
import org.nrg.xnat.atul.subjectmapping.entities.SubjectMappingcsf;

import java.util.List;

public interface SubjectMappingServicecsf extends BaseHibernateService<SubjectMappingcsf> {
    /**
     * Finds the subject with the indicated {@link SubjectMappingcsf#getSubjectId() subject ID}.
     *
     * @param subjectId The subject ID.
     *
     * @return The subject with the indicated ID, null if not found.
     */
    SubjectMappingcsf findBySubjectId(final String subjectId);

    /**
     * Finds the subject with the indicated {@link SubjectMappingcsf#getRecordId()} record ID} in the specified {@link
     * SubjectMappingcsf#getSource() source system}.
     *
     * @param recordId The subject ID.
     * @param source   The ID of the source system.
     *
     * @return The subject with the indicated record ID in the specified source system, null if not found.
     */
    SubjectMappingcsf findByRecordId(final String recordId, final String source);

    /**
     * Finds all subjects in the indicated {@link SubjectMappingcsf#getSource() source system}.
     *
     * @param source The ID of the source system.
     *
     * @return All subjects from the indicated source system.
     */
    List<SubjectMappingcsf> findBySource(final String source);
}
