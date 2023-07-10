package org.example;

public class Teacher extends Person{
    private String school;
    private String subject;
    private int salary;

    public Teacher(String name, String gender, int ID, String school, String subject, int salary) {
        super(name, gender, ID);
        this.school = school;
        this.subject = subject;
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }
    public String setSchool() {
        return this.school = school;
    }

    public String getSubject() {
        return subject;
    }
    public String setSubject() {
        return this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }
    public int setSalary() {
        return this.salary = salary;
    }
}
