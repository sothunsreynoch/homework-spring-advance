package com.sreynoch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @CreationTimestamp
    @Column(name = "update_at")
    private LocalDateTime updateAt;
    @ManyToOne
    private Role role;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;


}
