package com.magz014.microservice.course.service;

import com.magz014.microservice.course.client.StudentClient;
import com.magz014.microservice.course.dto.StudentDTO;
import com.magz014.microservice.course.entitis.Course;
import com.magz014.microservice.course.http.respose.StudentByCourseResponse;
import com.magz014.microservice.course.presistence.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService{

    @Autowired
    private ICourseRepository courseRepository;
    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentByIdCourse(Long courseId) {
        // Consultar el curso
        Course course = courseRepository.findById(courseId).orElse(new Course());

        // Obtener los estudiantes
        List<StudentDTO> studentDTOList = studentClient.findAllStudentByCourse(courseId);

        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();
    }
}
