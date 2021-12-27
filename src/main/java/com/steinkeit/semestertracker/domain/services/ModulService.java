package com.steinkeit.semestertracker.domain.services;

import com.steinkeit.semestertracker.domain.model.annotations.AggregateRoot;
import com.steinkeit.semestertracker.domain.repositoryabstractions.ModulRepository;
import org.springframework.stereotype.Service;

//TODO: Remove all @Service annotations from the domain
@Service
@AggregateRoot
public class ModulService {

    ModulRepository modulRepository;

    public ModulService(ModulRepository modulRepository) {
        this.modulRepository = modulRepository;
    }
}
