package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // zad 1
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = scan.nextInt();
        }
        checkIfPositive(numbers);
        checkIfNegative(numbers);
        checkIfEven(numbers);
        checkIfOdd(numbers);
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
        evenOrOdd(number);
    }

    static void checkIfPositive(int[] numbers)
    {
        System.out.println("Positive:");
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > 0)
                System.out.println(numbers[i]);
        }
        System.out.println();
    }

    static void checkIfNegative(int[] numbers)
    {
        System.out.println("Negative:");
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] < 0)
                System.out.println(numbers[i]);
        }
        System.out.println("");
    }

    static void checkIfEven(int[] numbers)
    {
        System.out.println("Even:");
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 == 0)
                System.out.println(numbers[i]);
        }
        System.out.println();
    }

    static void checkIfOdd(int[] numbers)
    {
        System.out.println("Odd:");
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 != 0)
                System.out.println(numbers[i]);
        }
        System.out.println("");
    }

    static void count5(int[]numbers)
    {
        int count = 0;
        for (int i = 0; i < numbers.length; i++)
        {if (numbers[i] == 5)
            count++;}
        System.out.println("5 count: " + count);
        System.out.println("");
    }

    static void initials(String name)
    {
        char i = name.charAt(0);
        System.out.println("initial: " + i);
        System.out.println("");
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
        System.out.println();
    }

    static void evenOrOdd(int number)
    {
        if (number % 2 == 0) System.out.println("true");
        else System.out.println("false");
        System.out.println();
    }

    static void stringRemove(String str1, String str2)
    {
        System.out.println(str1.replace(str2, ""));
    }
}