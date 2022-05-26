package com.instantSnap.demo.entity;

public class MessageEntity {
    public Long id;
    public String message;

    public MessageEntity(){

    }

    public MessageEntity(Long id, String message){
        this.id = id;
        this.message = message;
    }
}
