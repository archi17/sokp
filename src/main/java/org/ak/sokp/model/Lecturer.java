package org.ak.sokp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "lecturers")
public class Lecturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lecturerId;
    private String firstName;
    private String lastName;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "may_conduct",
            joinColumns = { @JoinColumn(name = "lecturerId") },
            inverseJoinColumns = { @JoinColumn(name = "courseId") }
    )
    private Set<Course> mayConductCourses = new HashSet<>();

}
