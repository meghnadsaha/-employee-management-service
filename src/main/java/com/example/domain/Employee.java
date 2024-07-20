package com.example.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Document(collection = "employees")
public class Employee {
    @Id
    private String id;
    private String name;
    private String address;
    private int age;
    private String department;

    private String status; // e.g., Remote Location, Contract Employee, Full-Time
    private Location location; // assuming Location is another class
    private List<AuditTrail> auditTrail; // Ensure this field is included


    // Getters and Setters
}

