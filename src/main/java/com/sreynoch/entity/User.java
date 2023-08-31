package com.sreynoch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "verified_code")
    private String verifiedCode;
    @Column(unique= true)
    private String uuid;
    @Column(name="student_card_no")
    private String studentCardNumber;
    @Column(name= "phone_number",length = 30)
    private String phoneNumber;
    private String password;
    @Column(name="one_singnal_id")
    private String oneSignalId;
    private String email;
    @Column(length = 10)
    private String gender;
    private String name;
    @Column(name = "is_verified")
    private Boolean isverified;
    @Column(name="is_student")
    private Boolean isStudent;
    @Column(name="is_Delete")
    private Boolean isDelete;
    @OneToMany(mappedBy = "user")
    private List<UserRole> userRoles;
    @OneToMany(mappedBy = "user")
    private List<UserAccount> userAccounts;



}
