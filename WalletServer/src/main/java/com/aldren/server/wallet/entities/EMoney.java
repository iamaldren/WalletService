package com.aldren.server.wallet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "Money")
public class EMoney extends BaseEntity {

    @Column(name = "user_id")
    private int userId;
    @Column(name = "currency_id")
    private int currencyId;
    private double amount;

}
