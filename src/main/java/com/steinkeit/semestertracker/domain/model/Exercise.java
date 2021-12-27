package com.steinkeit.semestertracker.domain.model;

public class Exercise {

    private final ExerciseId exerciseId;
    private final Integer number;
    private final String title;

    public Exercise(ExerciseId exerciseId, Integer number, String title) {
        this.exerciseId = exerciseId;
        this.number = number;
        this.title = title;
    }
}
