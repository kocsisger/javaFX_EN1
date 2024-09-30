package org.example.model;

import java.time.LocalDate;

public class Model {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public Model() {
        this.student = new Student("Rob Smith",
                52,
                LocalDate.of(1999,5,4));
    }
}
