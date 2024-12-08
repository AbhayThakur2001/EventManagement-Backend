package com.cloudthat.eventservice.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventModel {
    private Long id;

    private String name;

    private String description;

    private Instant startDateTime;

    private Instant endDateTime;

    private Long venueId;

    private Long organizerId;
}
