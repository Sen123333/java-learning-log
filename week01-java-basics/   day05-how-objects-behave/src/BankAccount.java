public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }

        balance = balance + amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }

        if (amount > balance) {
            return false;
        }

        balance = balance - amount;
        return true;
    }
}
