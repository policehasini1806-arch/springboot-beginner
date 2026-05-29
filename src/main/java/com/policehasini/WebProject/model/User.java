package com.policehasini.WebProject.model;

//POJO-Plain Old Java Objects
public class User {
    private String name;
    private String image;
    private String gender;
    private int id;

    //Default constructor
    public User(){
        
    }

    //Parameterized constructor
    public User(String name, String image, String gender,int id) {
        this.name = name;
        this.image = image;
        this.gender = gender;
        this.id = id;
    }

    //GETTERS AND SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return this.gender;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getImage() {
        return this.image;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Integer getId() {
        return this.id;
    }
}
