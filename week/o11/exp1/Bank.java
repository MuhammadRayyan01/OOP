package exp1;

public class Bank {
    private final AccountRepository repository;

    public Bank() {
        this(new InMemoryAccountRepository());
    }

    public Bank(AccountRepository repository) {
        this.repository = repository;
    }

    public boolean addAccount(Account account) {
        if (repository.findByNumber(account.getAccountNumber()) != null) {
            return false;
        }
        repository.save(account);
        return true;
    }

    public Account findAccount(String accountNumber) {
        return repository.findByNumber(accountNumber);
    }

    public void printAllAccounts() {
        for (Account acc : repository.findAll()) {
            acc.printInfo();
        }
    }

    public void printMonthlyFees() {
        for (Account acc : repository.findAll()) {
            System.out.println(acc.getAccountNumber() + " fee: " + acc.monthlyFee());
        }
    }

    public void processMonthEnd() {
        for (Account acc : repository.findAll()) {
            if (acc instanceof InterestBearing bearing) {
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber() + " interest applied, new balance: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }

    public double totalAssets() {
        double total = 0;
        for (Account acc : repository.findAll()) {
            total += acc.getBalance();
        }
        return total;
    }

    public void printHistory(String accountNumber) {
        Account acc = findAccount(accountNumber);
        if (acc == null) {
            System.out.println("account not found " + accountNumber);
            return;
        }
        for (Transaction t : acc.getHistory()) {
            System.out.println(accountNumber + " " + t);
        }
    }
}
