package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // zad 1
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = scan.nextInt();
        }
        positive(numbers);
        negative(numbers);
        chetni(numbers);
        nechetni(numbers);
        count5(numbers);

        // zad 2
        String str1 = scan.next();
        String str2 = scan.next();
        stringRemove(str1, str2);

        // zad 3

        // zad 4
        String name = scan.next();
        initials(name);

        // zad 5

        // dr zad 1
        int[] num = {1, 4, -5};
        minInt(num);

        // dr zad 2
        int number = scan.nextInt();
        chetnoNechetno(number);
    }
    static void positive(int[] numbers)
    {
        System.out.println("positive:");
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > 0)
                System.out.println(numbers[i]);
        }
    }
    static void negative (int[] numbers)
    {
        System.out.println("negative:");
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] < 0)
                System.out.println(numbers[i]);
        }
    }
    static void chetni (int[] numbers)
    {
        System.out.println("chetni:");
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 == 0)
                System.out.println(numbers[i]);
        }
    }
    static void nechetni (int[] numbers)
    {
        System.out.println("nechetni:");
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 != 0)
                System.out.println(numbers[i]);
        }
    }
    static void count5 (int[]numbers)
    {
        int count = 0;
        for (int i = 0; i < numbers.length; i++)
        {if (numbers[i] == 5)
                count++;}
        System.out.println("5 count: " + count);
    }
    static void initials (String name)
    {
        char i = name.charAt(0);
        System.out.println("initial: " + i);
    }
    static void charRemoval(String str1, String str2)
    {

    }
    static void minInt(int[] num)
    {
        int min = num[0];
        for (int i = 0; i < num.length; i++)
        {
            if (num[i] < min)
                min = num[i];
        }
        System.out.println("min: " + min);
    }
    static void chetnoNechetno(int number)
    {
        if (number % 2 == 0) System.out.println("true");
        else System.out.println("false");
    }
    static void stringRemove(String str1, String str2)
    {
        System.out.println(str1.replace(str2, ""));
    }

}
