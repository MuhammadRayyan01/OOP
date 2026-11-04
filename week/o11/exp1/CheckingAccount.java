package exp1;

public class CheckingAccount extends Account {
    private static final double MONTHLY_FEE = 15000;
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, Customer owner, double balance, double overdraftLimit) {
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return amount > 0 && amount <= getBalance() + overdraftLimit;
    }

    @Override
    public double monthlyFee() {
        return MONTHLY_FEE;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Account type: Checking, overdraft limit: " + overdraftLimit);
    }
}
