
abstract class BankAccount {
    protected double balance;
    
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    
    public abstract void deposit(double amount);
    
    public abstract void withdraw(double amount);
    
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
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
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
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
}

public class inheritance16 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        
        CurrentAccount currentAccount = new CurrentAccount(2000);
        currentAccount.deposit(1000);
        currentAccount.withdraw(3000);
        System.out.println("Current Account Balance: $" + currentAccount.getBalance());
    }
}