package com.projects.ProTrackr.controllers;

import com.projects.ProTrackr.models.Project;
import com.projects.ProTrackr.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;
    @PostMapping("/create")
    ResponseEntity createProject(@RequestBody Project project){
        Project createdProject=projectService.createProject(project);
        return  ResponseEntity.status(HttpStatus.OK).body(createdProject);
    }

    @GetMapping("/projects")
    ResponseEntity getAllProjects(){
        return ResponseEntity.status(HttpStatus.OK).body(projectService.getAllProjects());
    }


}
