package com.steinkeit.semestertracker.domain.repositoryabstractions;

import com.steinkeit.semestertracker.domain.model.Student;

public interface StudentRepository {

    public Student getStudentByMatriculation(String matriculation);
}
