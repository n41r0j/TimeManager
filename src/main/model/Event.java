package main.model;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Event {
    private String event_title;
    private String event_description;
    private LocalDate event_startDate;
    private LocalDate event_endDate;
    private int timeline_id;
    private int event_id;

    public Event(){}
    public Event(String eventName, String eventDescription, LocalDate start, LocalDate end) {
    }

    public Event(String eventName, String eventDescription, LocalDate date) {
        this.event_title = eventName;
        this.event_description = eventDescription;
        this.event_startDate = date;
    }


    public String getEvent_title() {
        return event_title;
    }

    public void setEvent_title(String event_title) {
        this.event_title = event_title;
    }

    public String getEvent_description() {
        return event_description;
    }

    public void setEvent_description(String event_description) {
        this.event_description = event_description;
    }

    public LocalDate getEvent_startDate() {
        return event_startDate;
    }

    public void setEvent_startDate(LocalDate event_startDate) {
        this.event_startDate = event_startDate;
    }

    public LocalDate getEvent_endDate() {
        return event_endDate;
    }

    public void setEvent_endDate(LocalDate event_endDate) {
        this.event_endDate = event_endDate;
    }

    public int getTimeline_id() {
        return timeline_id;
    }

    public void setTimeline_id(int timeline_id) {
        this.timeline_id = timeline_id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }
}
