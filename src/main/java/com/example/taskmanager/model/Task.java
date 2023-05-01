package com.example.taskmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    private Long id;
    private String title;
    private String description;
    private Status status;
}
