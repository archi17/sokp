package org.ak.sokp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Timetable {

    private List<String> dayOfWeek;
    private List<String> weekParity;
    private List<String> time;

    public static Timetable weekly() {
        return new Timetable(
              dayOfWeeks(),
              weekParity(),
              time()
        );
    }

    private static List<String> dayOfWeeks() {
        return Arrays.asList(
                "Poniedziałek",
                "Wtorek",
                "Środa",
                "Czwartek",
                "Piątek",
                "Sobota",
                "Niedziela"
        );
    }

    private static List<String> weekParity() {
        return Arrays.asList(
                "P",
                "N"
        );
    }

    private static List<String> time() {
        return Arrays.asList(
                "7:30",
                "9:15",
                "11:15",
                "13:15",
                "15:15",
                "17:05",
                "18:55"
        );

    }
}
