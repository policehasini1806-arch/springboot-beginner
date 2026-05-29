package com.policehasini.WebProject.services;

import java.util.*;

import com.policehasini.WebProject.model.*;

public class UserService {
    private List<User> allUsers;

    public UserService() {
        allUsers = new ArrayList<>();
        allUsers.add(new User("Jane Doe", "jane_img.png", "Female", 0));
        allUsers.add(new User("John Doe", "john_img.png", "Male", 1));
    }
    //C
    public void addUser(String name, String gender, String image){
        User newUser=new User(name, image, gender, allUsers.size());
        allUsers.add(newUser);
    }
    //R
    public List<User> getAllUsers() {
        return allUsers;
    }
    //R
    public User getSingleUser(int id) {
        return getAllUsers().get(id);
    }
    //U
    public void updateUser(String name, String gender,String image, int id) {
        User updUser=new User(name, image, gender, id);
        getAllUsers().set(id, updUser);
    }
    //D
    public void deleteUser(int id) {
        getAllUsers().remove(id);
    }
}
