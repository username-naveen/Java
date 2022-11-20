/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Accounts acc = new Accounts(200, 0.01);
        acc.status();
        acc.deposit(200);
        acc.status();
        acc.withDraw(213.20);
        acc.status();
    }
}