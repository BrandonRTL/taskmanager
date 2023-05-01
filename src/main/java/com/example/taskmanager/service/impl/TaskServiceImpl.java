package com.example.taskmanager.service.impl;

import com.example.taskmanager.exception.DataNotFoundException;
import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import com.example.taskmanager.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public Task getById(Long id) {

        return taskRepository.findById(id)
                .orElseThrow(() -> new DataNotFoundException("Task not found"));
    }
    @Override
    @Transactional
    public Task update(Task task) {
        return null;
    }

    @Override
    @Transactional
    public Task create(Task task) {
        return null;
    }


    @Override
    public List<Task> getAll() {
        return null;
    }

    @Override
    @Transactional
    public void delete(Long id) {

    }
}
