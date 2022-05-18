package com.bnta.university_enrollment.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String surname;
    @ManyToMany(mappedBy = "students")
    @JsonIgnoreProperties({"students"})
    private List<Class> classes;

    protected Student() {
    }

    public Student(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
        this.classes = new ArrayList<Class>();
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

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public void addClass(Class subj){ //Couldn't use 'class' as a variable name
        this.classes.add(subj);
    }

    public boolean removeClass(Class subj){
        return this.classes.remove(subj);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", classes=" + classes +
                '}';
    }
}