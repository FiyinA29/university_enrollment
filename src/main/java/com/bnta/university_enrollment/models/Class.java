package com.bnta.university_enrollment.models;

import java.util.List;

public class Class {

    private Long id;
    private String title;
    private String description;
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
