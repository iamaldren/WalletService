package com.aldren.client.wallet.exceptions;

import lombok.Getter;

@Getter
public class UserDoesNotExistsException extends RuntimeException {

    private String message;

    public UserDoesNotExistsException(String message) {
        this.message = message;
    }

}
