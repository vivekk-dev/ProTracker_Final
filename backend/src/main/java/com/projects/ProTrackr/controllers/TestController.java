package com.projects.ProTrackr.controllers;

import com.projects.ProTrackr.models.Project;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class TestController {
    @ResponseBody
    @GetMapping("/public/test")
    String test(){
        return "Hey there it is up and running Vviek";
    }
    //http://localhost:8080/projects';
//    @ResponseBody
//    @GetMapping("/projects")
    List<?> getAllProjects(){
        List<Project> projects =new ArrayList<>();
//        projects.add(new Project("ICICI1","Application Processing System"));
//        projects.add(new Project("ICICI2","Application Processing System"));

        return projects;
    }



}
