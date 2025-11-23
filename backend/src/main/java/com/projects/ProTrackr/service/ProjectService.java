package com.projects.ProTrackr.service;

import com.projects.ProTrackr.models.Project;
import com.projects.ProTrackr.models.Task;
import com.projects.ProTrackr.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;
    public Project createProject (Project project){
        if (project.getTasks() != null) {
            for (Task task : project.getTasks()) {
                task.setProject(project); // 🔑 set back-reference
            }
        }
            return projectRepository.save(project);
    }
    public List<Project> getAllProjects(){
        System.out.println("--->"+projectRepository.findAll());
        return projectRepository.findAll();
    }
    public Project findProjectById(String id){
        return projectRepository.findById(Long.parseLong(id)).get();
    }



}
