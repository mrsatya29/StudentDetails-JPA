package org.springjpa.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springjpa.practice.model.Student;
import org.springjpa.practice.repository.StudentRepo;

import java.util.List;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

 /*   @PersistenceContext
    private EntityManager entityManager;*/

/* //   @Transactional
    public Student saveStudent(Student student) {
        Student student1 = studentRepo.save(student);
        return student1;
    }

 //   @Transactional
    public Student findStudent(int id) {
        //     Student student =(Student) entityManager.find(Student.class,id);
        Student student = studentRepo.getById(id);
        return student;

    }*/

    @Override
    public Student saveStudentDetails(Student student) {
        Student student1 = studentRepo.save(student);
        return student1;
    }

    @Override
    public Student getStudentDetailsById(int id) {
        Student student = studentRepo.getById(id);
        return student;
    }

    @Override
    public List<Student> getStudentDetailsByEmailId(String email) {
      //  return studentRepo.findByEmail(email);
        return studentRepo.findByStudentEmail(email);
    }

}
