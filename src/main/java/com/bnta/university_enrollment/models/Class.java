package com.bnta.university_enrollment.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classes")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String description;
    @ManyToMany
    @JoinTable(name = "enrollments",
            joinColumns = {@JoinColumn(name = "student_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "class_id", nullable = false)})
    @JsonIgnoreProperties({"classes"})
    private List<Student> students;

    protected Class() {
    }

    public Class(String title, String description, List<Student> students) {
        this.title = title;
        this.description = description;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", students=" + students +
                '}';
    }
}
