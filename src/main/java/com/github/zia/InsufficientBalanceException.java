package com.github.zia;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String errorMsg){
    super(errorMsg);
        }
}
