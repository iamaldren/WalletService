package com.aldren.server.wallet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Transactions")
public class ETransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "currency_id")
    private int currencyId;
    private double amount;
    private String transactionType;
    private String transactionDate;

}
