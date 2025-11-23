package com.projects.ProTrackr.controllers;

import com.projects.ProTrackr.models.Task;
import com.projects.ProTrackr.repository.TaskRepository;
import com.projects.ProTrackr.service.TaskService;
import jakarta.persistence.PreUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/createTask/{projectId}")
    Task createTask(@RequestBody Task task, @PathVariable("projectId") String projectId) {
        return taskService.createTaskService(task, projectId);
    }

    @PostMapping("/tasks/project/{projectId}")
    List<Task> getTaskByProjectId(@PathVariable("projectId") String projectId) {
        return taskService.getTaskByProjectId(projectId);
    }

    @PutMapping("/tasks")
    Task updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

//    @DeleteMapping("/task")
//    int deleteTask(@PathVariable("taskId") String taskId) {
//        return taskService.d
//    }

}