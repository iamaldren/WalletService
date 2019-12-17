package com.aldren.server.wallet.exceptions;

import lombok.Getter;

@Getter
public class InsufficientFundsException extends WalletException {

    private String message;

    public InsufficientFundsException() {
        this.message = "Insufficient Fund";
    }
}
