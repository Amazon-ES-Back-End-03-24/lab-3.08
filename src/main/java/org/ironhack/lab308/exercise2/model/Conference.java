package org.ironhack.lab308.exercise2.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "conferences")
public class Conference extends Event {

    @ManyToMany
    @JoinTable(
            name = "conference_speakers",
            joinColumns = {@JoinColumn(name = "event_id")},
            inverseJoinColumns = {@JoinColumn(name = "speakers_id")}
    )
    private List<Speaker> speakers;

    public Conference(Integer id, Date date, Integer duration, String location, String title, List<Guest> guests, List<Speaker> speakers) {
        super(id, date, duration, location, title, guests);
        this.speakers = speakers;
    }

    public Conference(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public Conference(Date date, Integer duration, String location, String title, List<Speaker> speakers) {
        super(date, duration, location, title);
        this.speakers = speakers;
    }

    public Conference() {

    }
}
