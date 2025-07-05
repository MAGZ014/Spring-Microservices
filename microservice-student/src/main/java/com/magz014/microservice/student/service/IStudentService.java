package com.magz014.microservice.student.service;

import com.magz014.microservice.student.entitis.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> findByCourseId(Long courseId);
}
