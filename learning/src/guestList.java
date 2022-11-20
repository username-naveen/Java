import java.util.Scanner;

public class guestList {
    
    static String[] guestNames = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    insertGuests();

        do {
            
            showGuests();
            showMenu();
            int option = getOption();

            if (option == 1) {
                addGuests();
            } else if (option == 2) {                
                removeGuests();                
            } else if (option == 3) {
                renameGuest();
            } else if (option == 4) {
                insertGuestToList();
            } else if (option == 5) {
                System.out.println("Exiting...");
                break;
            }
            
        } while (true); 
    }

    static void insertGuests() {
        guestNames[0] = "Nee";
        guestNames[1] = "Naan";
        guestNames[2] = "Naam";
        guestNames[3] = "Namba";
        guestNames[4] = "Nanba";
    }

    static void showGuests() {
        System.out.println("----------------Guest Names----------------");
        int flag = 0;
        for (int i = 0; i < guestNames.length; i++) {
            if (guestNames[i] != null) {
                System.out.println( (i+1) + ". " + guestNames[i] );
                flag++;
            }
        }
        if (flag == 0){
            System.out.println( "Seems to be empty.");
        };
    }

    static void showMenu() {
        System.out.println("----------------Menu----------------");
        System.out.println("1. Add guest to the list.");
        System.out.println("2. Remove guest from the list.");
        System.out.println("3. Rename guest from the list.");
        System.out.println("4. Insert guest to the list.");
        System.out.println("5. Exit.");
    }

    static int getOption() {
        System.out.println("Your option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        
        return option;
    }

    static void addGuests() {
        for (int i = 0; i < guestNames.length; i++) {
            if ( guestNames[i] == null ) {
                System.out.print("Guest name: ");
                String name = scanner.nextLine();
                guestNames[i] = name;
                break;
            }
        }
    }

    static void removeGuests() {

        /*
         * delete by names
         */
        // System.out.print("Guest name: ");
        // String toRemove = scanner.next();
        // for (int i = 0; i < guestNames.length; i++) {
        //     if ( guestNames[i] != null && guestNames[i].equals(toRemove) ) {
        //         guestNames[i] = null;
        //         break;
        //     }
        // }

        /*
         * delete by numbers
         */
        System.out.print("Guest number: ");
        int toRemove = scanner.nextInt();
        if ( guestNames[toRemove-1] != null ) {

            for (int i = 0; i < guestNames.length; i++) {
                if ( guestNames[i] != null && i == toRemove - 1  ) {
                    guestNames[i] = null;
                    break;
                }
            }
            String[] temp = new String[guestNames.length];
            int ti = 0;
            for (int j = 0; j < temp.length; j++) {
                if (guestNames[j] != null) {
                    temp[ti] = guestNames[j];
                    ti++;
                }
            }
            guestNames = temp;
        } else {
            System.out.println("\nError: No names at the given input.");
        }
    }

    /*
     * the extra scanner.nextLine(); is that when you enter a number, say, 5 and hit enter
     * the program will take it as 5\n which is a new line and ....you got my point right.
     */

    static void renameGuest() {
        System.out.println("Guest number: ");
        int toRename = scanner.nextInt();
        scanner.nextLine();
        if (isExist(toRename - 1) == true) {
            System.out.println("Enter the correct name: ");
            guestNames[toRename - 1] = scanner.nextLine();
        } else {
            System.out.println("\nError: No name in the given number.");
        }
        
    }

    static boolean isExist(int number) {
        if (guestNames[number] != null) {
            return true;
        } else {
            return false;
        }
    }

    static void insertGuestToList() {
        System.out.println("Inserting number: ");
        int insertNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = guestNames.length; i > insertNumber; i++) {
            guestNames[i] = guestNames[i-1];
        }
        guestNames[insertNumber - 1 ] = scanner.nextLine();  
    }

}


