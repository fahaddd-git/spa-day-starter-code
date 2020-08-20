package org.launchcode.spaday.models;

public class User {
    private String username;
    private String email;
    private String password;
    private static int nextId =1;
    private int id;

    public User(String aUsername, String aEmail, String aPassword){
        this.username=aUsername;
        this.email=aEmail;
        this.password=aPassword;
        this.id=nextId;
        nextId++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }
}
