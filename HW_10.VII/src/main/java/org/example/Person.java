package org.example;

public class Person {
    String name;
    String gender;
    int ID;

    public Person(String name, String gender, int ID) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }
    public String setName(String name) {
        return this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public String setGender(String gender) {
        return this.gender = gender;
    }

    public int getID() {
        return ID;
    }
    public int setID() {
        return this.ID = ID;
    }
}
