package com.example.retrofitpractice;

public class Post {
    private String userID , id, title, body;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Post(String userID, String id, String title, String body) {
        this.userID = userID;
        this.id = id;
        this.title = title;
        this.body = body;
    }
}
