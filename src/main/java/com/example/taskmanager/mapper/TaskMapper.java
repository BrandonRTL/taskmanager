package com.example.taskmanager.mapper;


import com.example.taskmanager.dto.TaskDto;
import com.example.taskmanager.model.Task;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> tasks);

    Task toEntity(TaskDto taskDto);

    List<Task> toEntity(List<TaskDto> tasks);
}
