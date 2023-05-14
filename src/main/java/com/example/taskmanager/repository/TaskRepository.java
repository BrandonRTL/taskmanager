package com.example.taskmanager.repository;


import com.example.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Optional<Task> findById(Long id);

    void deleteById(Long id);

//    void update(Task task);

//    boolean isTaskOwner(Long userId, Long taskId);

//    List<Task> findAllTasksByUserId(Long id);

//    void assingToUserById(Long userId, Long taskId);
}
