package com.steinkeit.semestertracker.domain.services;

import com.steinkeit.semestertracker.domain.model.annotations.AggregateRoot;
import com.steinkeit.semestertracker.domain.repositoryabstractions.ExerciseRepository;
import org.springframework.stereotype.Service;

@Service
@AggregateRoot
public class ExerciseService {

    public ExerciseRepository exerciseRepository;

    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }
}
