package com.magz014.microservice.course.presistence;


import com.magz014.microservice.course.entitis.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends CrudRepository<Course, Long> {
}
