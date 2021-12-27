package com.steinkeit.semestertracker.domain.services;

import com.steinkeit.semestertracker.domain.model.Student;
import com.steinkeit.semestertracker.domain.model.annotations.AggregateRoot;
import com.steinkeit.semestertracker.domain.repositoryabstractions.StudentRepository;
import org.springframework.stereotype.Service;

@Service
@AggregateRoot
public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //Matriculation - Unikennung
    public Student getStudentByMatriculation(String matriculation) {
        return this.studentRepository.getStudentByMatriculation(matriculation);
    }
}
