package com.FeastFleet.FeastFleet.persistence.entity.request;

import java.io.Serializable;

public class ChatRequest implements Serializable {

    private String question;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
