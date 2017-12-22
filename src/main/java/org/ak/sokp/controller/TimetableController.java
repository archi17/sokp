package org.ak.sokp.controller;

import org.ak.sokp.controller.dto.TimetableDTO;
import org.ak.sokp.service.ITimetableService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/timetable")

public class TimetableController {

    private ITimetableService timetableService;
    private ModelMapper mapper;

    @Autowired
    public TimetableController(ITimetableService timetableService){
        this.timetableService = timetableService;
        mapper = new ModelMapper();
    }

    @RequestMapping(method = RequestMethod.GET)
    public TimetableDTO getTimeTable(){
        return mapper.map(timetableService.getTimetable(), TimetableDTO.class);
    }
}
