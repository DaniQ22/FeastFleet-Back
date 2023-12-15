package com.FeastFleet.FeastFleet.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


public class chatGptMessage {

    private int chatId;

    private String userId;

    private String content;

    private LocalDateTime date;

    private User user;

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
