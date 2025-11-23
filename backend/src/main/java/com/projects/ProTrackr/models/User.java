package com.projects.ProTrackr.models;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "users")
@Getter@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String name;
    private String email;
    private String role; // ADMIN, DEVELOPER, MANAGER
}
