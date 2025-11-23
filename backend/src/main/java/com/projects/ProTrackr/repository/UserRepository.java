package com.projects.ProTrackr.repository;

import com.projects.ProTrackr.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
