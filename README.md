Banking System Application
A simple banking application demonstrating Object-Oriented Programming (OOP) principles. This application allows users to create accounts, check balances, deposit funds, and withdraw funds. Each operation is recorded as a transaction, and users can view their transaction history.
Features
Create Account: Users can create a new account.
Check Balance: Users can view their current balance.
Deposit Funds: Users can deposit money into their account.
Withdraw Funds: Users can withdraw money from their account, if they have sufficient balance.
Transaction History: Each deposit and withdrawal is recorded as a transaction, allowing users to view their transaction history.
OOP Concepts Used
Encapsulation: Each class (Bank, Account, Transaction) manages its data and behavior, exposing only necessary methods.
Abstraction: Simplified interactions between classes by focusing on high-level actions.
Modularity: Each class has a specific role, making the code modular and easy to maintain.
Reusability: Each class is designed to be reusable for future expansions or enhancements.
Class Structure
1. Bank
Manages user accounts.
Can create new accounts and retrieve existing accounts.
2. Account
Represents an individual user's bank account.
Handles balance-related operations like checking balance, depositing, and withdrawing funds.
Maintains a list of Transaction records.
3. Transaction
Records details of each transaction.
Stores the transaction type (Deposit or Withdrawal), amount, and timestamp.
Setup and Installation
1. Clone the Repository:
   git clone https://github.com/your-username/banking-system.git
  cd banking-system
2. Compile the Code: Use any Java IDE (e.g., IntelliJ, Eclipse) or compile from the command line:
   javac *.java
3. Run the Application:
   java BankingApp
Usage
Creating Accounts: Use createAccount(accountId, accountHolderName) in the Bank class to add a new account.
Depositing Funds: Use deposit(amount) on an Account instance to add money to the balance.
Withdrawing Funds: Use withdraw(amount) on an Account instance to subtract money if sufficient balance exists.
Checking Balance: Use checkBalance() to view the current balance.
Viewing Transaction History: Use getTransactions() to see the transaction history for an account.
Contributing
Contributions are welcome! If you would like to improve this project, please fork the repository and create a pull request. Follow these steps:
1. Fork the Repository.
2. Create a New branch:
   git checkout -b feature-branch
3. Make Changes and Commit:
   git commit -m "Add new feature"
4. Push to the Branch:
   git push origin feature-branch
5. Create a Pull Request.


