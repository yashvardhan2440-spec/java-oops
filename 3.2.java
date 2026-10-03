abstract class BankAccount {
    String accountNumber;
    String customerName;
    double balance;

    final String BANK_NAME = "ABC Bank";

    BankAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    final void displayBankInformation() {
        System.out.println("Bank Name: " + BANK_NAME);
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String customerName,
                   double balance, double interestRate) {
        super(accountNumber, customerName, balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return balance * interestRate / 100;
    }

    void displaySavingsAccountDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    double cashbackPercentage;

    PremiumSavingsAccount(String accountNumber, String customerName,
                          double balance, double interestRate,
                          double cashbackPercentage) {
        super(accountNumber, customerName, balance, interestRate);
        this.cashbackPercentage = cashbackPercentage;
    }

    @Override
    double calculateInterest() {
        return balance * (interestRate + 2) / 100;
    }

    double calculateCashback(double amount) {
        return amount * cashbackPercentage / 100;
    }
}

final class BankRules {
    void displayRules() {
        System.out.println("Minimum balance should be maintained.");
        System.out.println("Transactions are subject to bank rules.");
    }
}

public class Main {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(
            "SA101", "Rahul", 10000, 5
        );

        savings.deposit(5000);

        System.out.println("\n--- Savings Account ---");
        savings.displaySavingsAccountDetails();

        System.out.println("Interest: " + savings.calculateInterest());

        PremiumSavingsAccount premium = new PremiumSavingsAccount(
            "PA101", "Amit", 20000, 6, 2
        );

        premium.deposit(5000);

        System.out.println("\n--- Premium Savings Account ---");
        premium.displayAccountDetails();

        System.out.println("Interest: " + premium.calculateInterest());

        double cashback = premium.calculateCashback(5000);
        System.out.println("Cashback: " + cashback);

        System.out.println("\n--- Bank Information ---");
        savings.displayBankInformation();

        System.out.println("\n--- Bank Rules ---");
        BankRules rules = new BankRules();
        rules.displayRules();
    }
}