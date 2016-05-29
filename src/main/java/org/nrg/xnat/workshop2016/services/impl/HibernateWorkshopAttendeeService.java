package org.nrg.xnat.workshop2016.services.impl;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntityService;
import org.nrg.xnat.workshop2016.entities.WorkshopAttendee;
import org.nrg.xnat.workshop2016.repositories.WorkshopAttendeeRepository;
import org.nrg.xnat.workshop2016.services.WorkshopAttendeeService;
import org.springframework.stereotype.Service;

@Service
public class HibernateWorkshopAttendeeService extends AbstractHibernateEntityService<WorkshopAttendee, WorkshopAttendeeRepository> implements WorkshopAttendeeService {
    @Override
    public WorkshopAttendee findByAttendeeId(final String attendeeId) {
        return getDao().findByUniqueProperty("attendeeId", attendeeId);
    }
}
