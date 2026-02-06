package AbstractDemo;

public class AbstractionDemo {
    public static void main(String[] args) {
//        creating object
        SavingAccount savingAccount = new SavingAccount("asdfsadf",200);
//        calling method deposit using SavingAccount object
        savingAccount.deposit(100);

//        creating object
        BankAccount savingAccount1 = new SavingAccount("retwert",230);
//        calling method deposit using SavingAccount object
        savingAccount1.deposit(200);

//        creating object
        CurrentAccount currentAccount = new CurrentAccount("nvkcvnbkd",110);
//        calling method deposit using SavingAccount object
        currentAccount.withdraw(50);


    }
}
