package com.instantSnap.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    
    public String message;

    public MessageEntity(){

    }

    public MessageEntity(Long id, String message){
        this.id = id;
        this.message = message;
    }
}
