package com.nest.patientapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name="Patients")
public class Patients {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String place;

    public Patients() {
    }

    public Patients(int id, String name, int age, String place) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
