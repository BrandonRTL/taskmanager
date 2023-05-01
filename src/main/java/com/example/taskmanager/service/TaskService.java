package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;

import java.util.List;

public interface TaskService {

    Task getById(Long id);

    Task update(Task task);

    Task create(Task task);

    List<Task> getAll();

    void delete(Long id);
}
