package com.instantSnap.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.instantSnap.demo.dto.SaveMessageRequest;
import com.instantSnap.demo.entity.MessageEntity;
import com.instantSnap.demo.repository.MessageRrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class AppController {

    
    private final MessageRrepository mRep;

    @Autowired
    public AppController(MessageRrepository repo){
        mRep = repo;
    }

    private List<MessageEntity> messages = new ArrayList<MessageEntity>(){
        {
            add(new MessageEntity(1L, "Message 1"));
            add(new MessageEntity(2L, "Message 3"));
        }
    } ;

    @PostMapping("")
    public List<MessageEntity> createMessage(@RequestBody SaveMessageRequest body){
        messages.add(
            new MessageEntity(messages.size() + 1L, body.message)
        );

        this.mRep.save(new MessageEntity(messages.size() + 1L, body.message));
        return this.mRep.findAll(); //  messages;
    }

    @GetMapping("")
    public List<MessageEntity> getMessages(){
        return this.mRep.findAll();
    }


    
}
