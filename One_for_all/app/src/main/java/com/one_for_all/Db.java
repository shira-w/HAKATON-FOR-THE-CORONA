package com.one_for_all;

import java.util.ArrayList;
import java.util.List;

class DB
{
    public List<Users> curUsers = new ArrayList<Users>();
    public List<Group> curGroups = new ArrayList<Group>();
    public List<UserInGroup> curUserInGroup=new ArrayList<UserInGroup>();
    public void init()
    {

        curUsers.add(new Users("rut","1234",true,1,false));
        curUsers.add(new Users("yair","1234",true,1,false));
        curUsers.add(new Users("tomer","1234",true,1,false));
        curUsers.add(new Users("einav","1234",true,1,false));
        curUsers.add(new Users("renana","1234",true,1,false));
        curUsers.add(new Users("tami","1234",true,1,false));
        curUsers.add(new Users("moshe","1234",true,1,true));
        curUsers.add(new Users("sari","1234",true,1,false));

        curGroups.add( new Group(1,"activity-jek",1234,"1234",true,"sport","green",3,0));
        curGroups.add( new Group(1,"class A",1234,"1234",true,"classes","green",3,0));
        curGroups.add( new Group(1,"shop-shop",1234,"1234",true,"shop","green",3,0));
        curGroups.add( new Group(1,"cofix",1234,"1234",true,"restaurent","green",3,0));


        curUserInGroup.add( new UserInGroup(1,1,1,null,null));

    }


}
