package com.tutors.tutorservice.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tutorId;
    private String name;
    private String surname;
    @ElementCollection
    private List<String> degrees;

    public Tutor() {
    }

    public Tutor(String name, String surname, List<String> degrees) {
        this.name = name;
        this.surname = surname;
        this.degrees = degrees;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<String> getDegrees() {
        return degrees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tutor tutor = (Tutor) o;

        if (!tutorId.equals(tutor.tutorId)) return false;
        if (name != null ? !name.equals(tutor.name) : tutor.name != null) return false;
        if (surname != null ? !surname.equals(tutor.surname) : tutor.surname != null) return false;
        return degrees != null ? degrees.equals(tutor.degrees) : tutor.degrees == null;
    }

    @Override
    public int hashCode() {
        int result = tutorId.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (degrees != null ? degrees.hashCode() : 0);
        return result;
    }
}
