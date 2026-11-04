package exp1;

public class SavingsAccount extends Account implements InterestBearing {
    private static final double MINIMUM_BALANCE = 50000;
    private double interestRate;

    public SavingsAccount(String accountNumber, Customer owner, double balance, double interestRate) {
        super(accountNumber, owner, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return amount > 0 && (getBalance() - amount) >= MINIMUM_BALANCE;
    }

    @Override
    public double monthlyFee() {
        return 0;
    }

    @Override
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Account type: Savings, interest rate: " + interestRate);
    }
}
