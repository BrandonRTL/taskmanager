package com.example.taskmanager.dto;

import com.example.taskmanager.model.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TaskDto {

    private Long id;
    private String title;
    private String description;
    private Status status;
    private Long ownerId;
}
