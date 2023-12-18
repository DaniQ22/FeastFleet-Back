package com.FeastFleet.FeastFleet.persistence.entity.request;

import com.FeastFleet.FeastFleet.persistence.entity.Message;

import java.io.Serializable;
import java.util.List;


public class ChatGPTRequest implements Serializable {
    private String model;

    private List<Message> messages;


    public ChatGPTRequest() {
    }

    // Constructor con todos los argumentos
    public ChatGPTRequest(String model, List<Message> messages) {
        this.model = model;
        this.messages = messages;
    }

    // Método builder
    public static ChatGPTRequestBuilder builder() {
        return new ChatGPTRequestBuilder();
    }

    // Métodos getter y setter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    // Clase Builder
    public static class ChatGPTRequestBuilder {
        private String model;
        private List<Message> messages;

        ChatGPTRequestBuilder() {
        }

        public ChatGPTRequestBuilder model(String model) {
            this.model = model;
            return this;
        }

        public ChatGPTRequestBuilder messages(List<Message> messages) {
            this.messages = messages;
            return this;
        }

        public ChatGPTRequest build() {
            return new ChatGPTRequest(model, messages);
        }
    }


}
