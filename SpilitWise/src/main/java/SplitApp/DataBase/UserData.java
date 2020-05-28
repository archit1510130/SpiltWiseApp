package SplitApp.DataBase;

import java.util.HashMap;
import java.util.Map;

import SplitApp.Models.User;

public class UserData {

    Map<String,User>userMap;
    public UserData()
    {
        this.userMap=new HashMap<String ,User>();
    }
    public void  addUser(User u)
    {
        System.out.println("ADDING USER");
        userMap.put(u.getId(),u);
    }

    public User getUser(String key)
    {
        return userMap.get(key);
    }


    
}