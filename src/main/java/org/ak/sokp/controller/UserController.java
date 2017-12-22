package org.ak.sokp.controller;

import org.ak.sokp.controller.dto.StudentDTO;
import org.ak.sokp.model.Student;
import org.ak.sokp.service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/users")
public class UserController {

    private IUserService userService;
    private ModelMapper modelMapper;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
        this.modelMapper = new ModelMapper();
    }

    @RequestMapping(method = RequestMethod.GET)
    public StudentDTO getLoggedInStudent() {
        Student student = userService.getLoggedInUser();
        return modelMapper.map(student, StudentDTO.class);
    }
}
