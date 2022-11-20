public class Accounts {
    private double balance;
    private double interestRate;

    //you can create this constructor by right click --> source action --> generate constructor
    public Accounts(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public boolean withDraw(double amount) {
        if (amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void status() {
        System.out.println("Your current balance is " + balance + " rupees.");
    }
}
