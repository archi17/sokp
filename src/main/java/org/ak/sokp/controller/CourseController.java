package org.ak.sokp.controller;

import org.ak.sokp.controller.dto.CourseDTO;
import org.ak.sokp.service.ICourseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path="/courses")
public class CourseController {

    private ICourseService courseService;
    private ModelMapper mapper;

    @Autowired
    public CourseController(ICourseService courseService) {
        this.courseService = courseService;
        mapper = new ModelMapper();
    }

    @RequestMapping(method = RequestMethod.GET, path="")
    public List<CourseDTO> getAllCourses() {
        List<CourseDTO> courses = courseService.getAllCourses().stream()
                .map((course -> mapper.map(course, CourseDTO.class)))
                .collect(Collectors.toList());

        return courses;
    }


}
