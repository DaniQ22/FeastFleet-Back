package com.FeastFleet.FeastFleet.persistence.entity;

import com.FeastFleet.FeastFleet.persistence.entity.request.ChatGPTRequest;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


public class Message implements Serializable {
    private String role;
    private String content;

    public Message() {
        // Constructor sin argumentos necesario para la serialización
    }

    public Message(String role, String content) {
        this.role = role;
        this.content = content;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Puedes agregar equals(), hashCode(), y otros métodos según tus necesidades

    @Override
    public String toString() {
        return "Message{" +
                "role='" + role + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    // Builder pattern manual

    public static MessageBuilder builder(){
        return new MessageBuilder();
    }

    public static  class MessageBuilder {
        private String role;
        private String content;

        MessageBuilder(){

        }

        public MessageBuilder role(String role){
            this.role = role;
            return this;
        }

        public  MessageBuilder content(String content){
            this.content = content;
            return this;
        }

        public Message build(){
            return new Message(role, content);
        }
    }
}
