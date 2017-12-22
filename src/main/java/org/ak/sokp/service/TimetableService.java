package org.ak.sokp.service;

import org.ak.sokp.model.Timetable;
import org.springframework.stereotype.Service;

@Service
public class TimetableService implements ITimetableService {

    @Override
    public Timetable getTimetable() {
        return Timetable.weekly();
    }

}
