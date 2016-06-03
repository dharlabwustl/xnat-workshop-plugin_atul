package org.nrg.xnat.demo.repositories;

import org.nrg.framework.orm.hibernate.AbstractHibernateDAO;
import org.nrg.xnat.demo.entities.SubjectMapping;
import org.springframework.stereotype.Repository;

@Repository
public class SubjectMappingRepository extends AbstractHibernateDAO<SubjectMapping> {
}
