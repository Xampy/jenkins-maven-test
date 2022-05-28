package com.instantSnap.demo.dto;

public class SaveMessageRequest {
    public String message;

    public SaveMessageRequest() {

    }
    
    public SaveMessageRequest(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
