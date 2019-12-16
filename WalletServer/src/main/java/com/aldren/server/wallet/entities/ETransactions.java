package com.aldren.server.wallet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "transactions")
public class ETransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long currencyId;
    private double amount;
    private String transactionType;
    private String transactionDate;

}
