package com.bnta.university_enrollment.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String firstName;
    @Column
    private String surname;
    @Column(name = "date_of_birth")
    private LocalDate dob;
    @ManyToMany(mappedBy = "students")
    @JsonIgnoreProperties({"students"})
    private List<Subject> subjects;

    protected Student() {
    }

    public Student(String firstName, String surname, LocalDate dob) {
        this.firstName = firstName;
        this.surname = surname;
        this.dob = dob;
        this.subjects = new ArrayList<Subject>();
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addSubject(Subject subject){
        this.subjects.add(subject);
    }

    public boolean removeSubject(Subject subject){
        return this.subjects.remove(subject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dob +
                ", subjects=" + subjects +
                '}';
    }
}