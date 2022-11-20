public class savingsAccount extends Accounts{

    public savingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public boolean withDraw(double amount) {
        double fee = 0.025 * amount;
        amount += fee;
        return super.withDraw(amount);
    }
    
}
