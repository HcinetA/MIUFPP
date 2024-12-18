package Lesson9.lesson12;

// User-defined exception class.
class AccountException extends Exception {
    public AccountException(String message) {
        super(message);
    }
}

// CustomerAccount class
public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false; // Negative or zero deposits are not allowed
        }
    }

    public boolean withdraw(double amount) throws AccountException {
        if (amount > balance) {
            throw new AccountException("Withdraw amount exceeds the balance.");
        } else if ((balance - amount) < 100) {
            throw new AccountException("Balance cannot be below $100.");
        } else {
            balance -= amount;
            return true;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        try {
            CustomerAccount account = new CustomerAccount("John Doe", "12345678", 500.0);

            // deposit
            System.out.println("Depositing $200...");
            account.deposit(200);
            System.out.println("Current Balance: $" + account.getBalance());

            // successful withdrawal
            System.out.println("Withdrawing $300...");
            account.withdraw(300);
            System.out.println("Current Balance: $" + account.getBalance());

            // drop below $100
            System.out.println("Withdrawing $400...");
            account.withdraw(400);

        } catch (AccountException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        }
    }
}