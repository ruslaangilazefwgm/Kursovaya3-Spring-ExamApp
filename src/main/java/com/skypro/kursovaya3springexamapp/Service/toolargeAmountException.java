package com.skypro.kursovaya3springexamapp.Service;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class toolargeAmountException extends RuntimeException {

    public toolargeAmountException() {
    }

    public toolargeAmountException(String message) {
        super(message);
    }
}
