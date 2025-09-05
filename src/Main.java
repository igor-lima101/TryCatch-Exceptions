//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        BankAccount account = new BankAccount(1, "Sheeva", 200);

        try {
            account.deposit(100);
            account.withdraw(50);
            account.withdraw(300); // InsufficientFunds error
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.deposit(-10); // InvalidAmount error
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(account);

    }
}