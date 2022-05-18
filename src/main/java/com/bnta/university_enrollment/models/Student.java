package com.bnta.university_enrollment.models;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Long id;
    private String firstName;
    private String surname;
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