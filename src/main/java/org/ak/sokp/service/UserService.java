package org.ak.sokp.service;

import org.ak.sokp.model.Student;
import org.ak.sokp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    private StudentRepository studentRepository;

    @Autowired
    public UserService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getLoggedInUser() {
        return studentRepository.findOne(1L);
    }

}
