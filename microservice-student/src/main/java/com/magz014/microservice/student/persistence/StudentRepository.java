package com.magz014.microservice.student.persistence;

import com.magz014.microservice.student.entitis.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findAllByCourseId(Long courseId);
}
