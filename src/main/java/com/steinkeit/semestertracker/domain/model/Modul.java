package com.steinkeit.semestertracker.domain.model;

public class Modul {

    private final String name;
    private final Integer exerciseAmount;
    private final ModulId modulId;
    //TODO: find better name
    private final Integer passLimit;

    public Modul(String name, Integer exerciseAmount, ModulId modulId, Integer passLimit) {
        this.name = name;
        this.exerciseAmount = exerciseAmount;
        this.modulId = modulId;
        this.passLimit = passLimit;
    }

    public String getName() {
        return name;
    }

    public Integer getExerciseAmount() {
        return exerciseAmount;
    }

    public Integer getPassLimit() {
        return passLimit;
    }
}
