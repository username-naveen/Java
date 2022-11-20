public class arrayMethods {
    public static void main(String[] args) {
        int[] arr = {1,55,28,3};
        int[] a = callArr(arr);
        System.out.println(a);
    }

    public static int[] callArr(int[] arr)  {
        System.out.println(arr[1]);
        return arr;
    }
}
