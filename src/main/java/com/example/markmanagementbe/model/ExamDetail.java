package com.example.markmanagementbe.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class ExamDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
    private double mark;
    private String note;

}
