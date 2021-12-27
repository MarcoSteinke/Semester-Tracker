package com.steinkeit.semestertracker.domain.repositoryabstractions;

import com.steinkeit.semestertracker.domain.model.Modul;
import com.steinkeit.semestertracker.domain.model.ModulId;

public interface ModulRepository {

    public Modul getModulById(ModulId modulId);
}
