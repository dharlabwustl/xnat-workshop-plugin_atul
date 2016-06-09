package org.nrg.xnat.workshop.subjectmapping.repositories;

import org.nrg.framework.orm.hibernate.AbstractHibernateDAO;
import org.nrg.xnat.workshop.subjectmapping.entities.SubjectMapping;
import org.springframework.stereotype.Repository;

@Repository
public class SubjectMappingRepository extends AbstractHibernateDAO<SubjectMapping> {
}
