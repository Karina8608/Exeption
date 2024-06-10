package FundsException;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        try {
            account.deposit(200.0);
            account.withdraw(300.0);
            account.withdraw(1000.0); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}