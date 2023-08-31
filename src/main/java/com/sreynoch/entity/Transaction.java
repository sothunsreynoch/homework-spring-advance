package com.sreynoch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String uuid;
    @Column(name = "student_card-no")
    private String studentCardNumber;
    private String remark;
    private LocalDateTime transactionAt;
    @ManyToOne
    @JoinColumn(name = "sender_act_id")
    private Account senderAccountId;
    @ManyToOne
    @JoinColumn(name="receiver_act_id")
    private Account receiverActId;
    @Column(name = "is_payment")
    private Boolean isPayment;
    private BigDecimal amount;


}
