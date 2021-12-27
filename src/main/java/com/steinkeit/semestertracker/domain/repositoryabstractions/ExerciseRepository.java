package com.steinkeit.semestertracker.domain.repositoryabstractions;

import com.steinkeit.semestertracker.domain.model.Exercise;
import com.steinkeit.semestertracker.domain.model.ModulId;
import com.steinkeit.semestertracker.domain.model.StudentId;

public interface ExerciseRepository {
    public Exercise getExerciseByStudentIdAndModulId(StudentId studentId, ModulId modulId);
}
