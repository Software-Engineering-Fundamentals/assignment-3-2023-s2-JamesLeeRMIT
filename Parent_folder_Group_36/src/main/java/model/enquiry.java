// The class for enquiries
package main.java.model;

import java.time.LocalDate;

public class enquiry {
    // Contains private attributes and public methods enquiries
    private String enquiryID;
    private String title;
    private String sender;
    private String senderID;
    private String body;
    private LocalDate date;

    // Methods below should set their respective attributes
    public void setEnquiryID(String enquiryID) {
        this.enquiryID = enquiryID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    // Methods below should get their respective attributes
    public String getEnquiryID() {
        return enquiryID;
    }

    public String getTitle() {
        return title;
    }

    public String getSender() {
        return sender;
    }

    public String getSenderID() {
        return senderID;
    }

    public String getBody() {
        return body;
    }

    public LocalDate getDate() {
        return date;
    }
}