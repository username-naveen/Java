import java.util.ArrayList;

public class arrayLists {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Nothing");
        arr.add("Like I Said");
        arr.remove("Nothing");
        boolean a = arr.contains("Nothing");
        System.out.println(arr);
        System.out.println(a);
    }
}
