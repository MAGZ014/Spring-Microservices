package com.magz014.microservice.course.client;

import com.magz014.microservice.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8090/api/student")
public interface StudentClient {

    @GetMapping("/search-courses/{courseId}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long courseId);
}
