package org.ironhack.lab308.exercise1.model;

import jakarta.persistence.*;
import org.ironhack.lab308.exercise1.enums.Status;

import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Date renewalDate;

    @OneToOne(mappedBy = "president")
    private Chapter presidentChapter;

    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    public Member() {
    }

    public Member(Integer id, String name, Status status, Date renewalDate, Chapter presidentChapter, Chapter chapter) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
        this.presidentChapter = presidentChapter;
        this.chapter = chapter;
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

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Chapter getPresidentChapter() {
        return presidentChapter;
    }

    public void setPresidentChapter(Chapter presidentChapter) {
        this.presidentChapter = presidentChapter;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id) && Objects.equals(name, member.name) && status == member.status && Objects.equals(renewalDate, member.renewalDate) && Objects.equals(presidentChapter, member.presidentChapter) && Objects.equals(chapter, member.chapter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, renewalDate, presidentChapter, chapter);
    }
}
