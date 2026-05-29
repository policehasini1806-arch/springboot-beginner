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
    public Optional<User> getOneUser(int id){
        for(int i=0;i<allUsers.size();i++){
            User u=allUsers.get(i);
            if(u.getId()==id){
                return Optional.of(u);
            }
        }
        return Optional.empty();
    }
    public User createUser(User u){
        allUsers.add(u);
        return u;
    }
    public User updateUser(int id,User user){
        for(int i=0;i<allUsers.size();i++){
            User u=allUsers.get(i);
            if(u.getId()==id){
                allUsers.set(i, user);
                return u;
            }
        }
        return null;
    }
    public void deleteUser(int id){
        for(int i=0;i<allUsers.size();i++){
            User u=allUsers.get(i);
            if(u.getId()==id){
                allUsers.remove(i);
                break;
            }
        }
    }
    //R
    // public User getSingleUser(int id) {
    //     return getAllUsers().get(id);
    // }
    // //U
    // public void updateUser(String name, String gender,String image, int id) {
    //     User updUser=new User(name, image, gender, id);
    //     getAllUsers().set(id, updUser);
    // }
    // //D
    // public void deleteUser(int id) {
    //     getAllUsers().remove(id);
    // }
}
