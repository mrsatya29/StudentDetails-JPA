package org.springjpa.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springjpa.practice.model.Student;
import org.springjpa.practice.service.StudentService;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;
    @GetMapping("/student/{email}")
    @ResponseBody
    public List<Student> findStudent(@PathVariable("email")String email){
        List<Student> studentDetailsById = service.getStudentDetailsByEmailId(email);
        return studentDetailsById;
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Student findByName(@PathVariable int id) {

        Student studentResponse = (Student) service.getStudentDetailsById(id);
        return studentResponse;
    }

    @PostMapping("/student/savedetails")
    @ResponseBody
    public Student saveStudentDetails(@RequestBody Student student){
        Student student1 = service.saveStudentDetails(student);
        return student1;
    }

}
