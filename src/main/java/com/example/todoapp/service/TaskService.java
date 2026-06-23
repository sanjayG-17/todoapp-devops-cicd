package com.example.todoapp.service;

import com.example.todoapp.entity.Task;

import java.util.List;

public interface TaskService {

    Task addTask(Task task);

    List<Task> getAllTasks();

    Task getTaskById(Long id);

    Task updateTask(Long id, Task task);

    void deleteTask(Long id);

    List<Task> getCompletedTasks();

    List<Task> searchTasks(String keyword);
}