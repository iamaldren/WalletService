package com.aldren.server.wallet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "money")
public class EMoney extends BaseEntity {

    private Long userId;
    private Long currencyId;
    private double amount;

}
