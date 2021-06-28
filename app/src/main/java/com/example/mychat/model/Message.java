package com.example.mychat.model;

public class Message {
    private String owner;
    private String message;

    public Message() {
    }

    public Message(String owner, String message) {
        this.owner = owner;
        this.message = message;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
