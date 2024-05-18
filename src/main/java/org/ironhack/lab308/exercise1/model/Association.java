package org.ironhack.lab308.exercise1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "associations")
public class Association {
    @Id
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "association")
    private List<Chapter> chapters;

    public Association() {
    }

    public Association(Integer id, String name, List<Chapter> chapters) {
        this.id = id;
        this.name = name;
        this.chapters = chapters;
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

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Association that = (Association) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(chapters, that.chapters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, chapters);
    }
}
