package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService ser;

    @Autowired
    public StudentController(StudentService ser) {
        this.ser = ser;
    }

    @PostMapping("/add")
    public StudentEntity createData(@RequestBody StudentEntity stu) {
        return ser.createData(stu);
    }

    @GetMapping("/fetch")
    public List<StudentEntity> fetchRecord() {
        return ser.fetchRecord();
    }
}
