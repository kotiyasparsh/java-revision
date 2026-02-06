package AbstractDemo;

/*################Abstract Class###################*/
abstract public class BankAccount {
    private String accountNumber;
    private double balance;

    /*Abstract method of Abstract class*/
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }



}
