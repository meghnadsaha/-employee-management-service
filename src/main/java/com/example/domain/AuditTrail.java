package com.example.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AuditTrail {
    private LocalDateTime timestamp;
    private String changeDescription;

    // Constructors, getters, and setters
}
