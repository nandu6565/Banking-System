import java.util.HashMap;
import java.util.Map;

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountId, String accountHolderName) {
        Account newAccount = new Account(accountId, accountHolderName);
        accounts.put(accountId, newAccount);
        System.out.println("Account created successfully for " + accountHolderName);
    }

    public Account getAccount(String accountId) {
        return accounts.get(accountId);
    }
}
