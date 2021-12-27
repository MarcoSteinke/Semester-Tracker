package com.steinkeit.semestertracker.infrastructure.web;

import com.steinkeit.semestertracker.domain.services.ModulService;
import com.steinkeit.semestertracker.domain.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogicController {

    StudentService studentService;
    ModulService modulService;

    public LogicController(StudentService studentService, ModulService modulService) {
        this.studentService = studentService;
        this.modulService = modulService;
    }

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
}
