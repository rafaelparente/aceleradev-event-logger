package com.rafaelparente.eventlogger.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rafaelparente.eventlogger.models.EventLevel;
import lombok.Value;

import java.time.LocalDateTime;

@Value
public class EventDTO {

    private Long id;

    private EventLevel level;

    private String description;

    private String source;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime date;

    private Integer quantity;

}
