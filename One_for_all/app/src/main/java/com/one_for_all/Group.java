package com.one_for_all;

public class Group {

    private int idGroup;
    private String nameGroup;
    private int QRcode;
    private String password_group;
    private boolean actPermition;
    private String nameCategory;
    private String color;
    private int numUser;
    private int numsick;

    public int getIdGroup() {
        return idGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public int getQRcode() {
        return QRcode;
    }

    public String getPassword_group() {
        return password_group;
    }

    public boolean isActPermition() {
        return actPermition;
    }

    public String getCategory() {
        return nameCategory;
    }

    public String getColor() {
        return color;
    }

    public int getNumUser() {
        return numUser;
    }

    public int getNumsick() {
        return numsick;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void setQRcode(int QRcode) {
        this.QRcode = QRcode;
    }

    public void setPassword_group(String password_group) {
        this.password_group = password_group;
    }

    public void setActPermition(boolean actPermition) {
        this.actPermition = actPermition;
    }

    public void setCategory(String category) {
        this.nameCategory = category;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumUser(int numUser) {
        this.numUser = numUser;
    }

    public void setNumsick(int numsick) {
        this.numsick = numsick;
    }

    public Group(){
    }
}
