package org.springjpa.practice.service;

import org.springframework.stereotype.Component;
import org.springjpa.practice.model.Student;

import java.util.List;

@Component
public interface StudentService {

    public Student saveStudentDetails(Student student);
    public Student getStudentDetailsById(int id);
    public List<Student> getStudentDetailsByEmailId(String id);

}
