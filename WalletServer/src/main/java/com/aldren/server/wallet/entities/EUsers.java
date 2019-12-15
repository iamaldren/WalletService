package com.aldren.server.wallet.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "Users")
public class EUsers extends BaseEntity {

    private String userId;
    private String status;

}
