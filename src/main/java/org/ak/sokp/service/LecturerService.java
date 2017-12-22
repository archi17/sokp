package org.ak.sokp.service;

import org.ak.sokp.model.Course;
import org.ak.sokp.model.Lecturer;
import org.ak.sokp.repository.CourseRepository;
import org.ak.sokp.repository.LecturerRepository;
import org.ak.sokp.utils.IterableUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerService implements ILecturerService {

    private CourseRepository courseRepository;
    private LecturerRepository lecturerRepository;

    public  LecturerService(CourseRepository courseRepository, LecturerRepository lecturerRepository) {
        this.courseRepository = courseRepository;
        this.lecturerRepository = lecturerRepository;
    }

    @Override
    public List<Lecturer> findLecturersForCourse(Long courseId) {
        Course course = courseRepository.findOne(courseId);
        return IterableUtils.toList(lecturerRepository.findAllByMayConductCoursesIsContaining(course));
    }
}
