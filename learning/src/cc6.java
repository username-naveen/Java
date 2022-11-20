import java.util.Scanner;

public class cc6 {
    public static void main(String[] args) {
        // ex1();
        ex2();
        // ex3();
        // ex4();
    }

    /*
     * Exercise 1
     * You have been tasked with writing a program for a school which produces some statistics on students’ exam 
     * results. The users are teachers who will input each student’s score, and any other necessary data. 
     * Store the scores in an array. The program should output: Each student’s score and percentage for the exam
     * The mean (average) score and percentage of the exam
     * Hints:
     * Have the program ask how many students took the exam, so it knows how many scores to process. 
     * The program will also need to know the maximum possible score that can be achieved. 
     * It will also need to ask the user to input each student’s score (you can refer to each student as a number, 
     * e.g. “Student 1”, “Student 2”, etc, rather than asking for names.)
     */
    public static void ex1() {
        int studentsCount;
        double marksTotal;
        double marksObtained = 0;

        System.out.println("Maximum score of the exam: ");
        Scanner scanner = new Scanner(System.in);
        marksTotal = scanner.nextDouble();

        System.out.println("Enter the number of Students: ");
        studentsCount = scanner.nextInt();

        double[] marksIndividual = new double[studentsCount];

        System.out.println("Enter the marks of students one by one: ");
        for (int i = 0; i < marksIndividual.length; i++) {
            System.out.println("Student" + (i+1) + ": ");
            marksIndividual[i] = scanner.nextDouble();            
            marksObtained += marksIndividual[i];
        }

        System.out.println("Individual Percentages: ");
        for (int j = 0; j < marksIndividual.length; j++) {
            System.out.println("Student" + (j+1) + ": " + (marksIndividual[j] / marksTotal) * 100 + "%");
        }

        System.out.println("Average marks scored is: " + ((marksObtained/studentsCount) / marksTotal) * 100 + "%");
    }

    /*
     * Exercise 2
     * Write a quiz program with five true-or-false questions. Display a question to the user, and ask the user to 
     * enter either true or false, then move on to the next question. At the end of the quiz display the user’s score.
     * Use three arrays, a String array for holding the questions, a boolean array for the answers, and another 
     * boolean array for the user’s answers.
     * Hints:
     * You can use the Scanner’s nextBoolean() method to get the user’s input
     * Because the questions, answers, and user’s answers are stored in three separate arrays, 
     * you can use their indexes to associate them (e.g. index 1 in the answers array correlates to index 1 
     * in the questions array)
     */

     public static void ex2() {
        String[] questions = new String[5];
        boolean[] actualAnswers = new boolean[5];
        boolean[] userAnswers = new boolean[5];
        int score = 0;

        questions[0] = "Is sun a star?";
        actualAnswers[0] = true;

        questions[1] = "Is moon a star?";
        actualAnswers[1] = false;

        questions[2] = "Are you a star?";
        actualAnswers[2] = true;

        questions[3] = "Am I a star?";
        actualAnswers[3] = true;

        questions[4] = "Are we all a star?";
        actualAnswers[4] = true;

        System.out.println("Let's play a quiz game. \n 1 --> true \n 2 -->false");
        for (int i = 0; i < questions.length; i++) {
            System.out.println( (i+1) + ". " + questions[i]);
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == 1) {
                userAnswers[i] = true;
            } else if (input == 0) {
                userAnswers[i] = false;
            } 
            
        }
        
        for (int j = 0; j < userAnswers.length; j++) {
            if (userAnswers[j] == actualAnswers[j]) {
                score++;
            }
        }

        System.out.println("Your score: " + score);
     }

     /*
      * Exercise 3
      * Back in “Coding Challenge 4 - Loops”, for Exercise 5, you were tasked to write a guess-my-number game. 
      * The program picked a random number from 1 and 100 and you had to guess it.
      * This time, reverse the roles. Think of a number from 1 to 100 and write a program which tries to guess it.
      * Type “higher” if the program guesses too low, or “lower” if the program guesses too high. Have the program make
      * subsequent guesses based on this information. When the program guesses your number type “correct” and end the program.
      * Hint: Remember, if you need it, you can use the following line of code to generate a random number:
      * int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
      */

      public static void ex3() {
        
      }

      /*
       * Exercise 4
       * If you have not already done so, modify Exercise 3 so the program guesses your number in the least amount of steps.
       * Hint: Think about playing against a friend. How would you narrow it down to their number as quickly and efficiently 
       * as possible? You may not need to generate a random number at all.
       */
}
