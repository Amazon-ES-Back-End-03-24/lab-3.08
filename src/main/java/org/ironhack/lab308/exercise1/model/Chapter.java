package org.ironhack.lab308.exercise1.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "chapters")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String district;

    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;

    @OneToMany(mappedBy = "chapter")
    private List<Member> members;

    @ManyToOne
    @JoinColumn(name = "association_id")
    private Association association;

    public Chapter(Member president, String name, String district, Association association) {
        this.president = president;
        this.name = name;
        this.district = district;
        this.association = association;
    }

    public Chapter() {
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Member getPresident() {
        return this.president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Association getAssociation() {
        return this.association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chapter chapter = (Chapter) o;
        return Objects.equals(id, chapter.id) && Objects.equals(name, chapter.name) && Objects.equals(district, chapter.district) && Objects.equals(president, chapter.president) && Objects.equals(association, chapter.association) && Objects.equals(members, chapter.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, district, president, association, members);
    }
}
