package org.nrg.xnat.workshop2016.rest;

import io.swagger.annotations.Api;
import org.nrg.framework.annotations.XapiRestController;
import org.nrg.xnat.workshop2016.entities.WorkshopAttendee;
import org.nrg.xnat.workshop2016.services.WorkshopAttendeeService;
import org.nrg.xdat.rest.AbstractXnatRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Api(description = "XNAT Workshop Attendee API")
@XapiRestController
@RequestMapping(value = "/attendees")
public class WorkshopAttendeeRestController extends AbstractXnatRestApi {
    @RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<List<WorkshopAttendee>> getEntities() {

        return new ResponseEntity<>(_service.getAll(), HttpStatus.OK);
    }

    @RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.POST)
    public ResponseEntity<Void> createEntity(@RequestBody final WorkshopAttendee entity) {
        _service.create(entity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<WorkshopAttendee> getEntity(@PathVariable final String id) {
        return new ResponseEntity<>(_service.findByAttendeeId(id), HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.PUT)
    public ResponseEntity<Void> updateEntity(@PathVariable final String id, @RequestBody final WorkshopAttendee entity) {
        final WorkshopAttendee existing = _service.findByAttendeeId(id);
        existing.setAttendeeId(entity.getAttendeeId());
        existing.setMessage(entity.getMessage());
        _service.update(existing);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteEntity(@PathVariable final String id) {
        final WorkshopAttendee existing = _service.findByAttendeeId(id);
        _service.delete(existing);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Autowired
    private WorkshopAttendeeService _service;
}
