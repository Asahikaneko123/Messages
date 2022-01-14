package com.example.notification;

public class Person {
    int Image;
    String Name;
    String Des;


    public Person(int image, String name, String des) {
        this.Image = image;
        this.Name = name;
        this. Des = des;

    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

}
