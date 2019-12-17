package com.aldren.server.wallet.exceptions;

import lombok.Getter;

@Getter
public class CurrencyNotExistsException extends WalletException {

    private String message;

    public CurrencyNotExistsException() {
        this.message = "Unknown Currency";
    }

    public CurrencyNotExistsException(String currencyCode) {
        this.message = String.format("User doesn't have %s account", currencyCode);
    }

}
