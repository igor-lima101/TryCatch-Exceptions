public class BankAccount {

    private int number;
    private String name;
    private double amount;

    public BankAccount(int number, String name, double amount){
        this.number = number;
        this.name = name;
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double value) throws InvalidAmountException{
        if(value < 0){
            throw new InvalidAmountException("Invalid deposit: " + value);
        }

        amount += value;
        System.out.println("Deposit successful: " + value + " R$ | New amount: " + amount);
    }

    public void withdraw(double value) throws InvalidAmountException, InsufficientFundsException{
        if(value < 0){
            throw new InvalidAmountException("Invalid withdraw: " + value);
        }

        if(value > amount){
            throw new InsufficientFundsException("Insufficient Funds. try again: " + value + " R$, currently amount: " + amount);
        }

        amount -= value;
        System.out.println("Withdraw successful: " + value + " R$ | Remaining amount: " + amount);
    }

    @Override
    public String toString(){
        return "Account [" + number + "] | Holder: " + name + " | Amount: " + amount + " R$";
    }

}
