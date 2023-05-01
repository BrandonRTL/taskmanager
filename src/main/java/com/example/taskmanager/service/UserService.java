package com.example.taskmanager.service;


import com.example.taskmanager.model.Task;
import com.example.taskmanager.model.User;

import java.util.List;

public interface UserService {

    User getById(Long id);

    User getByUsername(String username);

    User update(User user);

    User create(User user);

    List<User> getAll();

    List<Task> getAllTasksByUserId(Long userId);

    boolean hasTask(Long userId, Long taskId);

    void delete(Long id);
}
