package org.ak.sokp.service;

import org.ak.sokp.model.Course;
import org.ak.sokp.repository.CourseRepository;
import org.ak.sokp.utils.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService {

    private CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses() {
        return IterableUtils.toList(courseRepository.findAll());
    }

}