package com.company.exception;

public class MatrixException extends Exception {
    private String cause;

    public MatrixException(String cause){
        this.cause = cause;
    }

    public String cause(){
        return this.cause;
    }
}
