package org.nrg.xnat.workshop2016.entities;

import org.nrg.framework.orm.hibernate.AbstractHibernateEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "attendeeId"))
public class WorkshopAttendee extends AbstractHibernateEntity {
    public String getAttendeeId() {
        return _attendeeId;
    }

    public void setAttendeeId(final String attendeeId) {
        _attendeeId = attendeeId;
    }

    public String getMessage() {
        return _message;
    }

    public void setMessage(final String message) {
        _message = message;
    }

    private String _attendeeId;
    private String _message;
}
