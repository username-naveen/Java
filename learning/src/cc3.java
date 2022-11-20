import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;

public class cc3 {
    public static void main(String[] args) {
        ex12();
        ex34();
    }
    /*
     * Exercise 1
     * Write a program with two int variables, int x and int y, and give each one a value. Depending on their values, print “x is bigger than y”, “x is smaller than y”, or “x and y are the same”. Change the values and run the program a few times to check it works.
     * 
     * Exercise 2
     * Modify the program from Exercise 1 so it also prints the difference between x and y.
     */

    public static void ex12() {
        System.out.println("Type in two integers(seperated with space):");
        Scanner nums = new Scanner(System.in);

        int num1 = nums.nextInt();
        int num2 = nums.nextInt();

        if ( num1 > num2 ) {
            System.out.format("%d is bigger than %d.\n", num1, num2 );
            System.out.format("The diiference between the nums is %d.", num1-num2);
        } else if (num1 < num2) {
            System.out.format("%d is smaller than %d.\n", num1, num2 );
            System.out.format("The diiference between the nums is %d.", num2-num1);
        } else if (num1 == num2) {
            System.out.format("%d is equal to %d.\n", num1, num2 );
        }
    }

    /*Exercise 3
    * Create a game where the program picks a random number from 1 to 5 and you, the player, has to guess it.
    * If the player guesses right, print “Correct! Aren’t you lucky.“.
    * If the player guesses wrong, print “Hard luck! Maybe next time.“.
    * You can use the line of code below which produces a random number from 1 to 5 and stores it in a variable called randomNumber.
    * nt randomNumber = ThreadLocalRandom.current().nextInt(1, 6); 
    *
    * Exercise 4
    * Modify the program from Exercise 3 so it gives the player two chances to guess the number. 
    */

    public static void ex34() {
        int computerPick = ThreadLocalRandom.current().nextInt(1,6);
        System.out.println("Pick a number from 1 to 5, guess it with computer: ");
        Scanner play1 = new Scanner(System.in);

    }
}
