package com.FeastFleet.FeastFleet.persistence.entity.response;


import com.FeastFleet.FeastFleet.persistence.entity.Message;

import java.io.Serializable;

public class Choise implements Serializable {
    private Integer index;
    private Message message;
    private String finishReason;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }
}
