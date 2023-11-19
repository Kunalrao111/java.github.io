
import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);
    
    void withdraw(double amount);
    
    double calculateInterest();
    
    double getBalance();
}

class SavingsAccount implements Account {
    private double balance;
    
    public SavingsAccount(double initialBalance) {
        balance = initialBalance;
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    @Override
    public double calculateInterest() {
        double interestRate = 0.05; // Assuming 5% interest rate
        return balance * interestRate;
    }
    
    @Override
    public double getBalance() {
        return balance;
    }
    
    public void performSavingsAccountSpecificOperation() {
        System.out.println("Performing savings account specific operation");
    }
}

class CurrentAccount implements Account {
    private double balance;
    
    public CurrentAccount(double initialBalance) {
        balance = initialBalance;
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    @Override
    public double calculateInterest() {
        // Current account does not earn interest
        return 0;
    }
    
    @Override
    public double getBalance() {
        return balance;
    }
    
    public void performCurrentAccountSpecificOperation() {
        System.out.println("Performing current account specific operation");
    }
}

class Bank {
    private List<Account> accounts;
    
    public Bank() {
        accounts = new ArrayList<>();
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public void depositToAccount(int accountIndex, double amount) {
        if (accountIndex >= 0 && accountIndex < accounts.size()) {
            Account account = accounts.get(accountIndex);
            account.deposit(amount);
        } else {
            System.out.println("Invalid account index");
        }
    }
    
    public void withdrawFromAccount(int accountIndex, double amount) {
        if (accountIndex >= 0 && accountIndex < accounts.size()) {
            Account account = accounts.get(accountIndex);
            account.withdraw(amount);
        } else {
            System.out.println("Invalid account index");
        }
    }
    
    public void calculateInterestForAccount(int accountIndex) {
        if (accountIndex >= 0 && accountIndex < accounts.size()) {
            Account account = accounts.get(accountIndex);
            double interest = account.calculateInterest();
            System.out.println("Interest calculated: $" + interest);
        } else {
            System.out.println("Invalid account index");
        }
    }
    
    public void viewAccountBalance(int accountIndex) {
        if (accountIndex >= 0 && accountIndex < accounts.size()) {
            Account account = accounts.get(accountIndex);
            double balance = account.getBalance();
            System.out.println("Account balance: $" + balance);
        } else {
            System.out.println("Invalid account index");
        }
    }
}

public class interfaces4 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        Account savingsAccount = new SavingsAccount(1000);
        bank.addAccount(savingsAccount);
        
        Account currentAccount = new CurrentAccount(2000);
        bank.addAccount(currentAccount);
        
        // Deposit to savings account
        bank.depositToAccount(0, 500);
        
        // Withdraw from current account
        bank.withdrawFromAccount(1, 1000);
        
        // Calculate interest for savings account
        bank.calculateInterestForAccount(0);
        
        // View balance for current account
        bank.viewAccountBalance(1);
        
        // Perform savings account specific operation
        ((SavingsAccount) savingsAccount).performSavingsAccountSpecificOperation();
        
        // Perform current account specific operation
        ((CurrentAccount) currentAccount).performCurrentAccountSpecificOperation();
    }
}