package com.example.markmanagementbe.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
