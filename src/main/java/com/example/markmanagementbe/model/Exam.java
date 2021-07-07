package com.example.markmanagementbe.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "exam")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "class_id")
    private ClassRoom classRoom;
    @OneToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    private Date dateUpdated;
    @OneToOne
    @JoinColumn(name = "semester_id")
    private Semester semester;
    private String note;
    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
