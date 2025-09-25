import java.util.*;

class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance: $" + balance);
    }
}

class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println(customer + " account opened at " + bankName);
    }

    public void showCustomers() {
        System.out.println("Bank: " + bankName + " has customers:");
        for (Customer c : customers) {
            c.viewBalance();
        }
    }
}

public class problem2{
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Taran", 5000);
        Customer c2 = new Customer("Sneha", 10000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        bank.showCustomers();
    }
}
