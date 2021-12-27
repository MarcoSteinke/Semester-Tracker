package com.steinkeit.semestertracker.domain.model;

public class StudentId {

    private final Long value;

    public StudentId(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return this.value;
    }
}
