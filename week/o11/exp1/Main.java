package exp1;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        SavingsAccount acc1 = new SavingsAccount("A001", customer1, 500000, 0.01);

        Customer customer2 = new Customer("Sari", "0812-0000-0002");
        CheckingAccount acc2 = new CheckingAccount("A002", customer2, 200000, 50000);

        Customer customer3 = new Customer("Rian", "0812-0000-0003");
        SavingsAccount savings = new SavingsAccount("A003", customer3, 100000, 0.02);

        try {
            savings.withdraw(70000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        try {
            savings.withdraw(30000);
            System.out.println("Withdrawal succeeded, new balance: " + savings.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(savings);
        bank.processMonthEnd();
    }
}
