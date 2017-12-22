package org.ak.sokp.service;

import org.ak.sokp.model.Lecturer;

import java.util.List;

public interface ILecturerService {
    List<Lecturer> findLecturersForCourse(Long courseId);
}
