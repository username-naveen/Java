import java.util.Scanner;

public class cc2 {

    public static void main(String[] args) {
        System.out.println("(1) --> Split your bill.\n(2) --> Age");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        switch (key) {
            case 1:
                ex1();
                break;
            case 2: 
                ex2();
                break;
            default:
                System.out.println("\nSeems you have mistyped or did not entered the right number. Please choose one from below.");
        }
    }

    public static void ex1() {
        System.out.println("How much is the cost of bill?");
        Scanner bill = new Scanner(System.in);
        double billCost = bill.nextFloat();

        System.out.println("How many people are there to split?");
        Scanner people = new Scanner(System.in);
        int totalPeople = people.nextInt();

        double splitAmount = billCost / totalPeople;
        System.out.format("There are %d people, each has to pay %.3f rupees", totalPeople, splitAmount);
    }

    public static void ex2() {
        System.out.println("\n\nHi, I'm Naveen and you?");
        Scanner name = new Scanner(System.in);
        String userName = name.nextLine();

        System.out.println("Would you care to confirm your age?");
        Scanner age = new Scanner(System.in);
        int userAge = age.nextInt();

        System.out.format("So %s, you have lived %d years. In another %d years, you'll be %d years old.", userName, userAge, userAge, userAge*2);

        if (userName.length() == userAge) {
            System.out.format("And it's interesting you name consists of same number of letters as your age, %d.", userAge);
        } else {
            System.out.format("By the way, your name consists of %d letters.", userName.length());
        }
    }
}
