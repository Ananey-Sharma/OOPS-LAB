package Experiment_6;

class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        System.out.println("Current Balance: " + balance);
        return balance;
    }
    
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Cannot withdraw. Minimum balance of 100 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(500);
        
        myAccount.getBalance();
        myAccount.deposit(200);
        myAccount.withdraw(150);
        myAccount.withdraw(450); // This should trigger the minimum balance warning
        myAccount.getBalance();
    }
}