import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class cc4 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }

    /*
     * Exercise 1
     * Write a program which prints numbers from 89 to 117.
     */
    public static void ex1() {
        for (int i = 89 ; i <= 117 ; i++ ) {
            System.out.println(i);
        }
    }

    /*
     * Exercise 2
     * Write a program which prints numbers from 1 to 40. 
     * After every third number, print “Quack.”
     */
    public static void ex2() {
        for (int i = 1; i <= 40 ; i++) {
            if ( (i % 4) == 0) {
                System.out.println("Quack");
                continue;
            }
            System.out.println(i);
        }
    }

    /*
     * Exercise 3
     * Write a program which asks the user for a password. 
     * Make the password “shark50”. 
     * Each time the user enters the password incorrectly, 
     * prompt them for a password again. When the user enters the 
     * password correctly, print “ACCESS APPROVED”.
     */
    public static void ex3() {
        String password = "shark50";
        Scanner userPassword;
        String entered;

        do {
            System.out.println("Let's see you remember or not, what is your password: ");
            userPassword = new Scanner(System.in);
            entered = userPassword.next();
        } while (!entered.equals(password));

        System.out.println("Seems you got it right.");
    }

    /*
     * Exercise 4
     * Write a program which makes use of a loop to print the following output:
     * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
     */
    public static void ex4() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", ");
        }
    }

    /*
     * Exercise 5
     * Create a game where the program picks a random number from 1 to 100 and the 
     * player has to guess it. Each time the player makes a guess, print “HIGHER” 
     * if the guess was too low or “LOWER” if the guess was too high. If the player 
     * correctly guesses the number, print “CORRECT”, then end the game.
     * You can use the line of code below which produces a random number from 1 to 100, 
     * and stores it in randomNumber.
     */

    public static void ex5() {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int userNumber;
        do {
            System.out.println("Guess a number from 1 to 100: ");
            Scanner scanner = new Scanner(System.in);
            userNumber = scanner.nextInt();
            if ( userNumber < randomNumber ) {
                System.out.println("HIGHER");
            } else if ( userNumber > randomNumber ) {
                System.out.println("LOWER");
            }
        } while (userNumber != randomNumber);
        
        System.out.println("CORRECT");
    }

    /*
     * Exercise 6
     * Modify the program in Exercise 5 so that once the game is won, 
     * it informs the player how many guesses it took them.
     */

    public static void ex6() {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int userNumber;
        int i = 0;
        do {
            System.out.println("Guess a number from 1 to 100: ");
            Scanner scanner = new Scanner(System.in);
            userNumber = scanner.nextInt();
            i++;
            if ( userNumber < randomNumber ) {
                System.out.println("HIGHER");
            } else if ( userNumber > randomNumber ) {
                System.out.println("LOWER");
            }
        } while (userNumber != randomNumber);
        
        System.out.println("CORRECT");
        System.out.println("It took " + i + " guesses.");
    }
}
