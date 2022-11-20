public class arrays {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,6,4,5};
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        //     i++;
        // }

        boolean[] booleans = new boolean[5]; // by default boolean array will return false
        for (int i = 0; i < booleans.length; i++) {
            System.out.println(booleans[i]);
        }

        String[] string = new String[5]; // by default String array will return null
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]);
        }

        int[] integer = new int[5]; // by default int array will return 0
        for (int i = 0; i < integer.length; i++) {
            System.out.println(integer[i]);
        }
    }
}
