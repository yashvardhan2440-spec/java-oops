abstract class bankaccount {
    String accountno;
    String customerno;
    double balance;

    final String BANK_NAME = "SBI";

    bankaccount(String accountno, String customerno, double balance) {
        this.accountno = accountno;
        this.customerno = customerno;
        this.balance = balance;
    }

    final void displaybankinfo() {
        System.out.println("Bank Name: " + BANK_NAME);
    }

    final void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    final void displayaccountdetails() {
        System.out.println("Account Number: " + accountno);
        System.out.println("Customer Number: " + customerno);
        System.out.println("Balance: " + balance);
    }

    abstract double calculateinterest();
}

class savingaccount extends bankaccount {
    double interestrate;

    savingaccount(String accountno, String customerno, double balance, double interestrate) {
        super(accountno, customerno, balance);
        this.interestrate = interestrate;
    }

    @Override
    double calculateinterest() {
        return (balance * interestrate) / 100;
    }

    void displaysavingaccountdetails() {
        displayaccountdetails();
        System.out.println("Interest Rate: " + interestrate + "%");
    }
}

class premiumsavingaccount extends savingaccount {
    double cashbackperecentage;

    premiumsavingaccount(String accountno, String customerno, double balance,
                         double interestrate, double cashbackperecentage) {
        super(accountno, customerno, balance, interestrate);
        this.cashbackperecentage = cashbackperecentage;
    }

    @Override
    double calculateinterest() {
        return (balance * (interestrate + 1)) / 100;
    }

    double calculatecashback(double amount) {
        return (amount * cashbackperecentage) / 100;
    }
}

final class BankRules {

    void displayRules() {
        System.out.println("Rule 1: Maintain minimum balance.");
        System.out.println("Rule 2: Keep account details secure.");
    }
}

public class bank {
    public static void main(String[] args) {

        savingaccount s = new savingaccount("SA101", "YASH", 100000, 5);

        s.deposit(50000);
        s.displaysavingaccountdetails();

        double savingsInterest = s.calculateinterest();
        System.out.println("Savings Interest: " + savingsInterest);

        System.out.println();

        premiumsavingaccount pm =
            new premiumsavingaccount("PA101", "RAHUL", 20000, 6, 2);

        pm.deposit(30000);
        pm.displayaccountdetails();

        double premiumInterest = pm.calculateinterest();
        System.out.println("Premium Interest: " + premiumInterest);

        double cashback = pm.calculatecashback(3000);
        System.out.println("Cashback: " + cashback);

        System.out.println();

        pm.displaybankinfo();

        BankRules rules = new BankRules();
        rules.displayRules();
    }
}