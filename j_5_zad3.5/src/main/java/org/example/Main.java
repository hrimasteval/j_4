package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String reversedSentence = reverseWordsOrder(sentence);

        System.out.println("Reversed sentence: " + reversedSentence);


        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        System.out.println("Original List: " + list);

        switchFirstLastElement(list);

        System.out.println("Modified List: " + list);
    }

    public static String reverseWordsOrder(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static void switchFirstLastElement(ArrayList<String> list) {
        if (list.size() >= 2) {
            // Get the first and last elements
            String first = list.get(0);
            String last = list.get(list.size() - 1);

            // Swap the first and last elements
            list.set(0, last);
            list.set(list.size() - 1, first);
        }
    }
}
