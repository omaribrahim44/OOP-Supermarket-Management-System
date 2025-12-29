package com.supermarket.model;

public class User {
    private String username;
    private String password;
    private String id;
    private String gender;
    private String dob;

    public User(String username, String password, String id, String gender, String dob) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.gender = gender;
        this.dob = dob;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
