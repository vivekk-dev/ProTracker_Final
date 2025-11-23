package com.projects.ProTrackr.service;

import com.projects.ProTrackr.models.Project;
import com.projects.ProTrackr.models.Task;
import com.projects.ProTrackr.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    ProjectService projectService;
    public Task createTaskService(Task task, String projectId) {
        // 1️⃣ Find the project
        Project project = projectService.findProjectById(projectId);

        if (project == null) {
            throw new RuntimeException("Project not found with ID: " + projectId);
        }

        // 2️⃣ Link task to project
        task.setId(null); // ensure Hibernate treats this as a new entity
        task.setProject(project);

        // 3️⃣ Maintain existing task list
        if (project.getTasks() == null) {
            project.setTasks(new ArrayList<>());
        }
        project.getTasks().add(task);

        // 4️⃣ Save only the task (cascade will handle project link)
        return taskRepository.save(task);
    }
   public List<Task> getTaskByProjectId(String projectId){
        return taskRepository.findByProjectId(Long.parseLong(projectId));
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }
    public void deleteTask(String id){
        Task task=taskRepository.getReferenceById(Long.parseLong(id));
//        if(task!=null) taskRepository.delete(task);

    }
}
