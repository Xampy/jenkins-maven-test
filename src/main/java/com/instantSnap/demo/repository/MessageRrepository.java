package com.instantSnap.demo.repository;

import com.instantSnap.demo.entity.MessageEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRrepository extends JpaRepository<MessageEntity, Long> {
    
}
