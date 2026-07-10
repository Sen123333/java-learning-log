public class BankAccountTestDrive {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        System.out.println("Starting balance: " + account.getBalance());
        System.out.println();

        System.out.println("Deposit 100:");
        boolean depositResult = account.deposit(100);
        System.out.println("Deposit success: " + depositResult);
        System.out.println("Balance: " + account.getBalance());
        System.out.println();

        System.out.println("Withdraw 30:");
        boolean withdrawResult = account.withdraw(30);
        System.out.println("Withdraw success: " + withdrawResult);
        System.out.println("Balance: " + account.getBalance());
        System.out.println();

        System.out.println("Withdraw 1000:");
        boolean withdrawTooMuch = account.withdraw(1000);
        System.out.println("Withdraw success: " + withdrawTooMuch);
        System.out.println("Balance: " + account.getBalance());
        System.out.println();

        System.out.println("Deposit -10:");
        boolean negativeDeposit = account.deposit(-10);
        System.out.println("Deposit success: " + negativeDeposit);
        System.out.println("Balance: " + account.getBalance());
    }
}
