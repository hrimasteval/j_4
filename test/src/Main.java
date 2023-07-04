import java.util.Scanner;                                                   // scanner

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);                              // scanner

        // zad 1
        System.out.println("Day (of the week) number:");
        int day = scan.nextInt();                                           // int, inserted by user
        checkDay(day);

        // zad 2
        System.out.println("Username:");
        String name = scan.next();                                          // name, inserted by user
        System.out.println("Password:");
        int pass  = scan.nextInt();                                         // password, inserted by user
        loginInfo(name, pass);

    }
    static void checkDay(int day)
    {
        switch (day)                                                        // responses to int
        {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("i forgor \uD83D\uDC80");           // default response
        }
    }
    static void loginInfo(String name, int pass)
    {
        Scanner scan = new Scanner(System.in);

        if (name != "Ivan" && pass != 1234)                                 // checks if name or password is correct
        {                                                                   // if not, program loops back until
            System.out.println("Try again!");                               // correct data is inserted
            System.out.println("Username:");
            String name1 = scan.next();
            System.out.println("Password:");
            int pass1  = scan.nextInt();
            loginInfo(name1, pass1);
        }

        else if (name == "Ivan" && pass == 1234)
        {System.out.println("Welcome, Ivan!");}                             // if both right, welcomes user
    }
}