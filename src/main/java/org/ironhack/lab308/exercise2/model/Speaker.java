package org.ironhack.lab308.exercise2.model;

import jakarta.persistence.*;
import org.ironhack.lab308.exercise2.enums.Status;

@Entity
@Table(name = "speakers")
public class Speaker extends Guest{

    private double presentationDuration;

    public Speaker(String name, Status status, double expertee) {
        super(name, status);
        this.presentationDuration = expertee;
    }

    public Speaker() {
        super();
    }

    public double getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(double duration) {
        this.presentationDuration = duration;
    }
}
