package com.chat.chat.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Message {

    private String sender;
    private String content;
    private LocalDateTime timeStamp;
    private boolean deleted = false; // Soft delete flag
    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
        this.timeStamp = LocalDateTime.now();
    }
}
