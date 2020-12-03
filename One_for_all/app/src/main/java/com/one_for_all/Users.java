package com.one_for_all;

public class Users {

    private String userName;
    private String password;
    private Boolean permition;
    private int id;
    private Boolean sick;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getPermition() {
        return permition;
    }

    public void setPermition(Boolean permition) {
        this.permition = permition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSick(Boolean sick) {
        this.sick = sick;
    }

    public Boolean getSick() {
        return sick;
    }

    public Users(){

    }
}
