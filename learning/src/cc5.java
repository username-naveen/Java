import java.util.Scanner;

public class cc5 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    /*
     * Exercise 1
     * Create an integer array of 10 elements and give each element an 
     * arbitrary value. Print out the entire array using a loop.
     */
    public static void ex1() {
        int[] integer = {1,5,12,3,4,52,64,-5,84,-421};

        for (int i = 0; i < integer.length; i++) {
            System.out.println(integer[i]);
        }
    }

    /*
    Exercise 2
    Use a loop to populate an array with integers from 1 to 20. 
    Use another loop to print the contents of the array (the elements) backwards. 
    */
    public static void ex2() {
        int[] integer = new int[20];

        for (int i = 0; i < integer.length; i++) {
            integer[i] = i+1;
        }

        for (int i = integer.length - 1; i >= 0; i--) {
            System.out.println(integer[i]);
        }
    }

    /*
     * Exercise 3
     * Create an array of five doubles and give each element some value. 
     * Calculate the sum of all the elements and print the result. 
     * Calculate the mean/average of the all the elements and print that too.
     */
    public static void ex3() {
        System.out.println("Number of inputs: ");
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();

        double[] doubles = new double[number];

        for (int i = 0; i < number; i++) {
            System.out.print("doubles[" + i + "]");
            double elements = scanner.nextDouble();
            doubles[i] = elements;
        }

        double result = 0;
        for (int i = 0; i < number; i++) {
            result += doubles[i];
        }

        System.out.println("Sum: " + result);
        System.out.println("Mean: " + result/number);
    }

    /*
     * Exercise 4
     * Write a program which asks the user to enter their top five favourite 
     * foods and store their answers in a string array. However, create the 
     * array so it can only hold a maximum of three strings. After the user enters 
     * the third item, print “No more memory available.”, then print out the 
     * contents of the array.
     * Note: For this program use scanner.nextLine() when grabbing input from
     *  the user. This is because if the user enters a food such as “Ice cream” 
     * then scanner.next() will interpret that as two separate strings, due to 
     * the space. This may result in the program storing “Ice” as one the user’s 
     * favourite foods, and “cream” as another. However, if you use 
     * scanner.nextLine(), it will return the entire line as a single string.
     */
    public static void ex4() {

        Scanner scanner = new Scanner(System.in);

        String[] favFoods = new String[3];
        System.out.println("Hey, what's your top 5 favorite food items:");

        for (int i = 0; i < favFoods.length; i++) {
            System.out.print("favFoods[" + i + "]");
            favFoods[i] = scanner.nextLine();
        }

        System.out.println("No more space vro.");

        System.out.println("Your favorites are: ");
        for (int i = 0; i < favFoods.length; i++) {
            System.out.println(favFoods[i]); 
        }
    }
}
