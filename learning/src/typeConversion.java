public class typeConversion {
    public static void main(String[] args) {
        int a = 2;
        double b = a;
        System.out.println(b); 
        /**
         * this is a implicit conversion, where JAVA automatially
         * converts int to double without losing any data.
         */

        double c = 20;
        int d = (int)c;
        System.out.println(d);
        /*
         * here, JAVA will not implicitily convert the double to int
         * because it might lose some data. So we have to add (int) 
         * before the double variable name while assigning to int variable
         */

        int num1 = 21;
        int num2 = 5;
        System.out.println( (double)num1 / num2 );
    }
}
