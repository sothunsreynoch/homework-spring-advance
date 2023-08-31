package com.sreynoch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable (
            name = "roles_authorities",
            joinColumns = @JoinColumn(name = "roles_id" , referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "authorities_id" , referencedColumnName = "id")
    )
    private List<Authority> authorities;




}
