package com.aldren.server.wallet.exceptions;

import lombok.Getter;

@Getter
public class UserDoesNotExistsException extends WalletException {

    private String message;

    public UserDoesNotExistsException() {
        this.message = "Unknown User";
    }

}
