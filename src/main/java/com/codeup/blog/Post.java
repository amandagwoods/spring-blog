package com.codeup.blog;

import java.util.List;

public class Post {
    private long id;
    private long userID;
    private String title;
    private String body;
    private List<Category> categories;

    public Post (long id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public Post (String title, String body){
        this.title = title;
        this.body = body;
    }

    public Post() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
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

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
