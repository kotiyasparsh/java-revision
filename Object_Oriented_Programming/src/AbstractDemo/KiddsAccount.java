package AbstractDemo;

public class KiddsAccount extends BankAccount {

    public KiddsAccount(String accountNumber, double balance){
        super(accountNumber,balance);
    }

//over_riding method
    @Override
    public void deposit(double amount) {
        System.out.println("########Kidz_Account########");
    }
//over_riding method
    @Override
    public void withdraw(double amount) {
        System.out.println("########Kidz_Account########");
    }
}
