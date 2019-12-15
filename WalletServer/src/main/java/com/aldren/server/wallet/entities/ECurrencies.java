package com.aldren.server.wallet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "Currencies")
public class ECurrencies extends BaseEntity {

    private String currencyCode;
    private String currencyName;

}
