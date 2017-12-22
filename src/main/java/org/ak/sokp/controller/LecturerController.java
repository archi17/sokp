package org.ak.sokp.controller;

import org.ak.sokp.controller.dto.CourseDTO;
import org.ak.sokp.controller.dto.LecturerDTO;
import org.ak.sokp.service.ILecturerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.QueryParam;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path="/lecturers")
public class LecturerController {

    private ILecturerService lecturerService;
    private ModelMapper mapper;

    @Autowired
    public LecturerController(ILecturerService lecturerService) {
        this.lecturerService = lecturerService;
        mapper = new ModelMapper();
    }

    @RequestMapping(method = RequestMethod.GET, path = "")
    public List<LecturerDTO> findLecturersForCourse(@QueryParam("courseId") Long courseId) {
        List<LecturerDTO> lecturerDTO = lecturerService.findLecturersForCourse(courseId).stream()
                .map(lecturer -> mapper.map(lecturer, LecturerDTO.class))
                .collect(Collectors.toList());

        return lecturerDTO;
    }

}
