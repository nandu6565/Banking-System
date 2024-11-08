public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create accounts
        bank.createAccount("A123", "John Doe");
        bank.createAccount("B456", "Jane Smith");

        // Deposit and Withdraw funds
        Account johnsAccount = bank.getAccount("A123");
        johnsAccount.deposit(500.0);
        johnsAccount.withdraw(200.0);

        // Check balance and transactions
        System.out.println("Balance: " + johnsAccount.checkBalance());

        System.out.println("Transaction History:");
        for (Transaction transaction : johnsAccount.getTransactions()) {
            System.out.println(transaction.getTransactionType() + ": " + transaction.getAmount() + " on " + transaction.getTimestamp());
        }
    }
}
