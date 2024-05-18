package org.ironhack.lab308.exercise2.model;

import jakarta.persistence.*;
import org.ironhack.lab308.exercise2.enums.Status;

import java.util.List;

@Entity
@Table(name = "guests")
@Inheritance(strategy = InheritanceType.JOINED)
public class Guest {
    @Id
    private Integer id;
    private String name;
    @Enumerated
    private Status status;
    @ManyToMany
    @JoinTable(
            name = "guest_event",
            joinColumns = {@JoinColumn(name = "guest_id")},
            inverseJoinColumns = {@JoinColumn(name = "event_id")}
    )
    private List<Event> events;


    public Guest(Integer id, String name, Status status, List<Event> events) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.events = events;
    }

    public Guest(Integer id) {
        this.id = id;
    }

    public Guest(String name, Status status, List<Event> events) {
        this.name = name;
        this.status = status;
        this.events = events;
    }

    public Guest(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public Guest() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}


