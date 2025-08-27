package Inheritance.HierarchicalInheritance;

// Base class: BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int depositTerm; // in months

    FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}

// Test class
public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 8000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 20000, 24);

        System.out.println("--- Savings Account ---");
        sa.displayAccountType();
        System.out.println();

        System.out.println("--- Checking Account ---");
        ca.displayAccountType();
        System.out.println();

        System.out.println("--- Fixed Deposit Account ---");
        fda.displayAccountType();
    }
}
