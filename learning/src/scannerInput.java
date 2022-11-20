import java.util.Scanner;;

public class scannerInput {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num = a.nextInt(); 
        String name = a.nextLine();
        /*
         * this scanner class from the java.util has several
         * functions inside, that are used to get input from the 
         * desired parameter passed into that. i.e Scanner(System.in)
         * the a.next() here is what input it should get, like int, 
         * string, double.
         */
        System.out.println(num);
        System.out.println(name);
    }
}
