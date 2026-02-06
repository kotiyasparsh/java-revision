package AbstractDemo;

public class CurrentAccount extends BankAccount {
    /*constructor*/
    public CurrentAccount(String accountNumber, double balance){
        super(accountNumber,balance);
    }
    @Override
    public void deposit(double amount) {
        System.out.println("Depostited in Current Account... ");
    }

    @Override
    public void withdraw(double amount){
        System.out.println("withdrawn in Current Account...  " +  amount);

    }
}
