package org.ak.sokp.repository;

import org.ak.sokp.model.Course;
import org.ak.sokp.model.Lecturer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LecturerRepository extends CrudRepository<Lecturer, Long> {
    List<Lecturer> findAllByMayConductCoursesIsContaining(Course course);
}
