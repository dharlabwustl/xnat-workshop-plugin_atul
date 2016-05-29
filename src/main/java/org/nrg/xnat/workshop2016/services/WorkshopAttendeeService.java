package org.nrg.xnat.workshop2016.services;

import org.nrg.framework.orm.hibernate.BaseHibernateService;
import org.nrg.xnat.workshop2016.entities.WorkshopAttendee;

public interface WorkshopAttendeeService extends BaseHibernateService<WorkshopAttendee> {
    WorkshopAttendee findByAttendeeId(final String attendeeId);
}
