package com.codingsuttle.project.uber.uberApp.entities;


import com.codingsuttle.project.uber.uberApp.enums.TransactionMethod;
import com.codingsuttle.project.uber.uberApp.enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class WalletTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private TransactionType transactionType;

    private TransactionMethod transactionMethod;

    @OneToOne
    private Ride ride;

    private String transactionId;

    @ManyToOne
    private Wallet wallet;  // ONE WALLET HAVE MANY TRANSACTION

    @CreationTimestamp
    private LocalDateTime timeStamp;
}
