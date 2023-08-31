package com.sreynoch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String uuid;
    private String pin;
    @Column(name = "acc_no")
    private String accountName;
    @Column(name = "acc_name")
    private String accountNumber;
    @Column(name="transfer_limit")
    private Integer transferLimit;
    @ManyToOne
    private AccountType accountType;
    private Boolean isDeleted;



}
