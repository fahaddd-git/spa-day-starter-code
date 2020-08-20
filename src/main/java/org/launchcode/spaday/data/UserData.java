package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {
    private static final Map<Integer, User> users = new HashMap<>();

   // add, getAll, and getById.

    public static void addUser(User aUser){
        users.put(aUser.getId(), aUser);
    }
    public static Collection<User> getAll(){
        return users.values();
    }
    public static User getById(int id){
        return users.get(id);
    }
}
