package com.example.convidados.model;

public class Feedback {

    public Feedback(String message){
        this.mMessage = message;
    }

    public Feedback(String message, boolean success){
        this.mMessage = message;
        this.mSuccess = success;
    }

    public boolean isSuccess(){
        return this.mSuccess;
    }

    public String getMessage(){
        return this.mMessage;
    }

    private boolean mSuccess = true;
    private String mMessage = "";
}
