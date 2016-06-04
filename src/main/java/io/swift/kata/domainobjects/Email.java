package io.swift.kata.domainobjects;

import java.time.LocalDateTime;
import java.util.List;

public class Email {
    private String subject;
    private String body;
    private String sender;
    private List<String> to;
    private List<String> cc;
    private List<String> bcc;
    private LocalDateTime date;
    private Long id;
    private Long inReplyTo;

    public Email() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public List<String> getCc() {
        return cc;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInReplyTo() {
        return inReplyTo;
    }

    public void setInReplyTo(Long inReplyTo) {
        this.inReplyTo = inReplyTo;
    }
}
