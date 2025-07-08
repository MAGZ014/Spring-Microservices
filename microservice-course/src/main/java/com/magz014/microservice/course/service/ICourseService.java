package com.magz014.microservice.course.service;

import com.magz014.microservice.course.entitis.Course;
import com.magz014.microservice.course.http.respose.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentByIdCourse(Long courseId);
}
