package org.example;

import com.sun.xml.internal.bind.v2.schemagen.episode.Klass;

public class Student extends Person{
    private String Klass;                                                    // "class" is considered as a class so it's "Klass"
    private int numberInKlass;
    private int grade;

    public Student(String name, String gender, int ID, String Klass, int numberInKlass, int grade) {
        super (name, gender, ID);
        this.Klass = Klass;
        this.numberInKlass = numberInKlass;
        this.grade = grade;
    }

    public String getKlass() {
        return Klass;
    }
    public String setKlass() {
        return this.Klass = Klass;
    }

    public int getNumberInKlass() {
        return numberInKlass;
    }
    public int setNumberInClass() {
        return this.numberInKlass = numberInKlass;
    }

    public int getGrade() {
        return grade;
    }
    public int setGrade() {
        return this.grade = grade;
    }
}
