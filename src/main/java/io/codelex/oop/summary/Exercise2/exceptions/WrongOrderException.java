package io.codelex.oop.summary.Exercise2.exceptions;

public class WrongOrderException extends Exception{
    public WrongOrderException(String errorMessage){
        super(errorMessage);
    }
}
