package com.sreynoch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @CollectionTable
    @Column(name = "update_at")
    private LocalDateTime updateAt;
    @Column(name = "is_disable")
    private Boolean isDisables;
    @ManyToOne
    private User user;
    @ManyToOne
    private Account account;
}
