package AbstractDemo;

public class SavingAccount extends BankAccount{

    /*Constructor*/
    public SavingAccount(String accountNumber, double balance){
        super(accountNumber,balance);
    }



/*defining the method of abstrac class it force to define it and get override*/
    @Override
    public void deposit(double amount) {
        System.out.println(amount+" Deposited... ");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount+" withdrawed... ");
    }
}
