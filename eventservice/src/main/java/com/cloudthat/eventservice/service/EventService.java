package com.cloudthat.eventservice.service;

import com.cloudthat.eventservice.model.EventModel;

import java.util.List;

public interface EventService {
    EventModel createEvent(EventModel eventModel);

    List<EventModel> getAllEvents();

    EventModel getEvent(Long eventId);

    EventModel updateEvent(Long eventId, EventModel eventModel);

    String deleteEvent(Long eventId);
}
