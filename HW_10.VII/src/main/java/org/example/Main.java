package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();

        Student student1 = new Student("Ivan Georgiev", "Male", 12345, "Mathematic", 1, 6);
        Student student2 = new Student("Anastasia Milanova", "Female", 67890, "Chemistry", 5, 3);
        students.add(student1);
        students.add(student2);

        Teacher teacher1 = new Teacher("Mr. Bodurov", "Male", 54321, "PGEE", "Physics", 5000);
        Teacher teacher2 = new Teacher("Ms. Popova", "Female", 98765, "PGEE", "History", 4500);
        teachers.add(teacher1);
        teachers.add(teacher2);

        printInfo(students, teachers);
        averageSalary(teachers);
    }

    public static void printInfo(List<Student> students, List<Teacher> teachers) {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Gender: " + student.getGender() + ", ID: " + student.getID() + ", Class: " + student.getKlass() + ", Number in Class: " + student.getNumberInKlass() + ", Grade: " + student.getGrade());
        }
        System.out.println();

        System.out.println("Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println("Name: " + teacher.getName() + ", Gender: " + teacher.getGender() + ", ID: " + teacher.getID() + ", School: " + teacher.getSchool() + ", Subject: " + teacher.getSubject() + ", Salary: " + teacher.getSalary());
        }
        System.out.println();
    }

    static double averageSalary(List<Teacher> teachers) {
        double totalSalary = 0.0;

        for (Teacher teacher : teachers) {
            totalSalary += teacher.getSalary();
        }

        return totalSalary / teachers.size();
    }

    //static double averageGrade(Student student) {                                     it don't work
        //int[] grades = student.getGrade();
        //int sum = 0;

        //for (int grade : grades) {
        //    sum += grade;
        //}
        //    return (double) sum / grades.length;
   // }
}
