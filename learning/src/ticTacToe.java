import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {

        System.out.println("\n----Tic-Tac-Toe----\n\nPositions\n");

        System.out.println( 0 + " | " + 1 + " | " + 2);
        System.out.println("--+---+--");
        System.out.println( 3 + " | " + 4 + " | " + 5);
        System.out.println("--+---+--");
        System.out.println( 6 + " | " + 7 + " | " + 8);
        System.out.println("\n");

        char[] pos = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
        char xOrO = 'X';
        int position;
        int turns = 0;

        while (true) {
            
            do {
                
                System.out.println("Enter the position(1-9) for " + xOrO);
                Scanner scanner = new Scanner(System.in);
                position = scanner.nextInt();

            } while (pos[position - 1] == 'X' || pos[position - 1] == '0');
               
            pos[position - 1] = xOrO;

            System.out.println( pos[0] + " | " + pos[1] + " | " + pos[2]);
            System.out.println("--+---+--");
            System.out.println( pos[3] + " | " + pos[4] + " | " + pos[5]);
            System.out.println("--+---+--");
            System.out.println( pos[6] + " | " + pos[7] + " | " + pos[8]);
            
            if (
            //rows
            pos[0] == xOrO && pos[1] == xOrO && pos[2] == xOrO 
            || pos[3] == xOrO && pos[4] == xOrO && pos[5] == xOrO 
            || pos[6] == xOrO && pos[7] == xOrO && pos[8] == xOrO
            //crosses
            || pos[2] == xOrO && pos[4] == xOrO && pos[6] == xOrO 
            || pos[0] == xOrO && pos[4] == xOrO && pos[8] == xOrO
            //columns
            || pos[0] == xOrO && pos[3] == xOrO && pos[6] == xOrO 
            || pos[1] == xOrO && pos[4] == xOrO && pos[7] == xOrO
            || pos[2] == xOrO && pos[5] == xOrO && pos[8] == xOrO) {
                System.out.println(xOrO + " is the WINNER.");
            }

            if (xOrO == 'X') {
                xOrO = '0';
            } else if (xOrO == '0') {
                xOrO = 'X';
            }

            turns++;

            if (turns == 9) {
                System.out.println("Seems a draw.");
                return;
            }
        }
    }
}
