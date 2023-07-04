package org.example;
import java.util.Scanner;                                                                    // scanner
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);                                               // scanner

        // zad 1
        String[] str = {"Alpha", "Avatar", "Beda", "Breza", "Salon"};                        // string

        for (int i = 0; i < str.length; i++)                                                 // checks if first letter
        {                                                                                    // is "A", then prints if
            if (str[i].charAt(0) == 'A' )                                                    // true
            {
                System.out.println(str[i]);
            }

        }

        // zad 2
        int sum = 0;
        int[] numbers = {3, 5, 2, 7, 3};
        for (int i = 0; i < numbers.length; i++)
        {
            sum = sum + numbers[i];                                                          // sum equals current
        }                                                                                    // sum plus current int
        System.out.println(sum);

        // zad 3
        List<String> dumichki = new ArrayList<>();                                           // zabraig 💀

        System.out.println("4ri dumi:");
        for (int i = 0; i < 4; i++) {
            String duma = scan.next();
            dumichki.add(duma);
        }

        List<String> gotoviDumi = filterWords(dumichki);

        System.out.println("Filtrirani:");
        for (String word : gotoviDumi) {
            System.out.println(word);
        }
    }
    public static List<String> filterWords(List<String> dumi) {
        List<String> gotoviDumi = new ArrayList<>();

        for (String duma : dumi) {
            if (duma.length() >= 4) {
                gotoviDumi.add(duma);
            }
        }
        return gotoviDumi;
    }
}
