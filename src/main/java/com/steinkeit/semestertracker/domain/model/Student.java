package com.steinkeit.semestertracker.domain.model;

import java.util.List;

public class Student {

    private final StudentId studentId;
    private final String matriculation;
    private final List<ModulId> moduls;

    public Student(StudentId studentId, String matriculation, List<ModulId> moduls) {
        this.studentId = studentId;
        this.matriculation = matriculation;
        this.moduls = moduls;
    }
}
