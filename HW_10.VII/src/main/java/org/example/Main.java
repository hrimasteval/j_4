package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();

        Student student1 = new Student("Ivan Georgiev", "Male", 12345, "Math", 7, 6);
        Student student2 = new Student("Anastasia Milanova", "Female", 67890, "Math", 1, 3);
        Student student3 = new Student("Georgi Ivanov", "Male", 54303, "History", 3, 4);
        Student student4 = new Student("Dimitur Pavlov", "Male", 44325, "History", 5, 5);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Teacher teacher1 = new Teacher("Mr. Bodurov", "Male", 54321, "PGEE", "Math", 5000);
        Teacher teacher2 = new Teacher("Ms. Popova", "Female", 98765, "PGEE", "History", 4500);
        teachers.add(teacher1);
        teachers.add(teacher2);

        printInfo(students, teachers);
        System.out.println("Average salary: " + averageSalary(teachers));
        System.out.println();
        highestGradeForSubjectMath(students);
        highestGradeForSubjectHistory(students);
        lowestGradeForSubjectMath(students);
        lowestGradeForSubjectHistory(students);
        System.out.println();
        averageGrade(students);
        System.out.println();
        System.out.println("Average grade in class: " + averageGradeAll(students));
        System.out.println();
        System.out.println("Highest grade in " + highestGradeInSubjectMath());
        System.out.println("Highest grade in " + highestGradeInSubjectHistory());
        System.out.println();
        System.out.println(gradeSignMath());
        System.out.println(gradeSignHistory());
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

    public static void highestGradeForSubjectHistory(List<Student> students)
    {
        Student student3 = new Student("Georgi Ivanov", "Male", 54303, "History", 3, 4);
        Student student4 = new Student("Dimitur Pavlov", "Male", 44325, "History", 5, 5);
        if (student3.getGrade() < student4.getGrade())
            System.out.println("Highest: " + student4.getName() + " " + student4.getKlass() + " " + student4.getGrade());
        else System.out.println("Highest: " + student3.getName() + " " + student3.getKlass() + " " + student3.getGrade());
    }

    public static void highestGradeForSubjectMath(List<Student> students)
    {
        Student student1 = new Student("Ivan Georgiev", "Male", 12345, "Math", 7, 6);
        Student student2 = new Student("Anastasia Milanova", "Female", 67890, "Math", 1, 3);
        if (student1.getGrade() > student2.getGrade())
            System.out.println("Highest: " + student1.getName() + " " + student1.getKlass() + " " + student1.getGrade());
        else System.out.println("Highest: " + student2.getName() + " " + student2.getKlass() + " " + student2.getGrade());
    }

    public static void lowestGradeForSubjectHistory(List<Student> students)
    {
        Student student3 = new Student("Georgi Ivanov", "Male", 54303, "History", 3, 4);
        Student student4 = new Student("Dimitur Pavlov", "Male", 44325, "History", 5, 5);
        if (student3.getGrade() > student4.getGrade())
            System.out.println("Lowest: " + student4.getName() + " " + student4.getKlass() + " " + student4.getGrade());
        else System.out.println("Lowest: " + student3.getName() + " " + student3.getKlass() + " " + student3.getGrade());
    }

    public static void lowestGradeForSubjectMath(List<Student> students)
    {
        Student student1 = new Student("Ivan Georgiev", "Male", 12345, "Math", 7, 6);
        Student student2 = new Student("Anastasia Milanova", "Female", 67890, "Math", 1, 3);
        if (student1.getGrade() < student2.getGrade())
            System.out.println("Lowest: " + student1.getName() + " " + student1.getKlass() + " " + student1.getGrade());
        else System.out.println("Lowest: " + student2.getName() + " " + student2.getKlass() + " " + student2.getGrade());
    }

    static void averageGrade(List<Student> students)
    {
        Student student1 = new Student("Ivan Georgiev", "Male", 12345, "Math", 7, 6);
        Student student2 = new Student("Anastasia Milanova", "Female", 67890, "Math", 1, 3);
        Student student3 = new Student("Georgi Ivanov", "Male", 54303, "History", 3, 4);
        Student student4 = new Student("Dimitur Pavlov", "Male", 44325, "History", 5, 5);

        System.out.println("Average grades:");
        System.out.println(student1.getName() + ": " + student1.getGrade());
        System.out.println(student2.getName() + ": " + student2.getGrade());
        System.out.println(student3.getName() + ": " + student3.getGrade());
        System.out.println(student4.getName() + ": " + student4.getGrade());
    }

    static double averageGradeAll(List<Student> students) {
        double totalGrade = 0.0;

        for (Student student : students) {
            totalGrade += student.getGrade();
        }

        return totalGrade / students.size();
    }

    static String highestGradeInSubjectMath()
    {
        Student student1 = new Student("Ivan Georgiev", "Male", 12345, "Math", 7, 6);
        Student student2 = new Student("Anastasia Milanova", "Female", 67890, "Math", 1, 3);

        if (student1.getGrade() > student2.getGrade())
            return student1.getKlass() + " " + student1.getGrade();
        else return student2.getKlass() + " " + student2.getGrade();
    }

    static String highestGradeInSubjectHistory()
    {
        Student student3 = new Student("Georgi Ivanov", "Male", 54303, "History", 3, 4);
        Student student4 = new Student("Dimitur Pavlov", "Male", 44325, "History", 5, 5);

        if (student3.getGrade() > student4.getGrade())
            return student3.getKlass() + " " + student3.getGrade();
        else return student4.getKlass() + " " + student4.getGrade();
    }

    static String gradeSignMath()
    {
        Student student1 = new Student("Ivan Georgiev", "Male", 12345, "Math", 7, 6);
        Student student2 = new Student("Anastasia Milanova", "Female", 67890, "Math", 1, 3);
        Teacher teacher1 = new Teacher("Mr. Bodurov", "Male", 54321, "PGEE", "Math", 5000);

        if (student1.getGrade() > student2.getGrade())
            return teacher1.getName() + " signed " + student1.getGrade() + " to " + student1.getName();
        else return teacher1.getName() + " signed " + student2.getGrade() + " to " + student2.getName();
    }

    static String gradeSignHistory()
    {
        Student student3 = new Student("Georgi Ivanov", "Male", 54303, "History", 3, 4);
        Student student4 = new Student("Dimitur Pavlov", "Male", 44325, "History", 5, 5);
        Teacher teacher2 = new Teacher("Ms. Popova", "Female", 98765, "PGEE", "History", 4500);

        if (student3.getGrade() > student4.getGrade())
            return teacher2.getName() + " signed " + student3.getGrade() + " to " + student3.getName();
        else return teacher2.getName() + " signed " + student4.getGrade() + " to " + student4.getName();
    }
}