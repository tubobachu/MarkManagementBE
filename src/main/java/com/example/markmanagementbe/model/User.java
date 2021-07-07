package com.example.markmanagementbe.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String userName;
    private String password;
    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
