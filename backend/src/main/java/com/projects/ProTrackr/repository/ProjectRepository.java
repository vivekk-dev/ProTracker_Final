package com.projects.ProTrackr.repository;

import com.projects.ProTrackr.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
