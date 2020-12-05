package com.one_for_all;

public class Users {

    private String userName;
    private String password;
    private Boolean permition;
    private int idUser;
    private Boolean sick;
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setPermition(Boolean permition) {
        this.permition = permition;
    }

    public int getidUser() {
        return idUser;
    }

    public void setidUser(int idUser) {
        this.idUser = idUser;
    }

    public void setSick(Boolean sick) {
        this.sick = sick;
    }

    public Boolean getSick() {
        return sick;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Users(){

    }


    public Users(String userName, String password, Boolean permition, int id, Boolean sick) {
        this.userName = userName;
        this.password = password;
        this.permition = permition;
        this.idUser = id;
        this.sick = sick;
    }

    }
