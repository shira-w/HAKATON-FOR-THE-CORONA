package com.one_for_all;

import android.icu.text.DateFormat;
import android.provider.ContactsContract;

public class UserInGroup {

    private int id;
    private int idUser;
    private int idGroup;
    private DateFormat start;
    private DateFormat end;

    public int getId() {
        return id;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public DateFormat getStart() {
        return start;
    }

    public DateFormat getEnd() {
        return end;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public void setStart(DateFormat start) {
        this.start = start;
    }

    public void setEnd(DateFormat end) {
        this.end = end;
    }

    public UserInGroup() {
    }


}
