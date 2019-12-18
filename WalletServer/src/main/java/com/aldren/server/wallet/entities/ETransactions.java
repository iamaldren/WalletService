package com.aldren.server.wallet.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "transactions")
public class ETransactions {

    @CreationTimestamp
    protected LocalDateTime transactionDate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long currencyId;
    private double amount;
    private String transactionType;

}
