import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountId;
    private String accountHolderName;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountId, String accountHolderName) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Deposit of " + amount + " successful.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
