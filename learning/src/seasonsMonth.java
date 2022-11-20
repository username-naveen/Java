public class seasonsMonth {
    public static void main(String[] args) {
        seasonOf(Month.Aug);
    }

    public static void seasonOf(Month month) {
        switch (month) {
            case Dec, Jan, Feb:
                System.out.printf("%s is the winter season.", month);
                break;
            case Mar, Apr, May:
                System.out.printf("%s is the Spring season.", month);
                break;
            case Jun, Jul, Aug:
                System.out.printf("%s is the Summer season.", month);
                break;
            case Sep, Oct, Nov:
                System.out.printf("%s is the Autumn season.", month);
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
