package org.ironhack.lab308.exercise2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "expositions")
public class Expositions extends Event {
    public Expositions(Integer id, Date date, Integer duration, String location, String title, List<Guest> guests) {
        super(id, date, duration, location, title, guests);
    }

    public Expositions() {
    }

    public Expositions(Date date, Integer duration, String location, String title) {
        super(date, duration, location, title);
    }
}
