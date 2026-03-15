package app;

import service.Bankservice;
import service.impl.BankServiceImpl;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Bankservice bankservice = new BankServiceImpl();
    System.out.println("Welcome to Console Bank");
        boolean running = true;
        while(running)
        {

            System.out.println("""
                1) Open Account
                2) Deposit
                3) Withdraw
                4) Transfer
                5) Account Statement
                6) List Accounts
                7) Search Account by Customer Name
                0) Exit
                """);
            System.out.println("Choose: ");
            String choice = scanner.nextLine().trim();
            System.out.println("CHOICE: " + choice);

            switch (choice){
                case "1" -> openAccount(scanner, bankservice);
                case "2" -> deposit(scanner, bankservice);
                case "3" -> withdraw(scanner, bankservice);
                case "4" -> transfer(scanner, bankservice);
                case "5" -> statement(scanner, bankservice);
                case "6" -> listAccounts(scanner, bankservice);
                case "7" -> searchAccounts(scanner, bankservice);
                case "0" -> running = false;
            }


        }



    }

    private static void openAccount(Scanner scanner, Bankservice bankservice ) {
        System.out.println(" Customer Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Customer email: ");
        String email = scanner.nextLine().trim();
        System.out.println("Account type (SAVING/CURRENT): ");
        String type = scanner.nextLine().trim();
        System.out.println("Inital deposit (optional, blank for 0): ");
        String amountstr = scanner.nextLine().trim();

//        chnage by gpt
        Double initial = amountstr.isEmpty() ? 0.0 : Double.valueOf(amountstr);
        String accountNumber = bankservice.openAccount(name,email,type);
        if(initial > 0)
            bankservice.deposit(accountNumber,initial, "Initial Deposit");

        System.out.println("Account opened: " + accountNumber);


    }

    private static void deposit(Scanner scanner, Bankservice bankservice) {
//        System.out.println("Account Number: ");
//        String accountNumber = scanner.nextLine().trim();
//        System.out.println("Amount: ");
//        Double amount = deposit(accountNumber, amount,"Deposit");
//        System.out.println("Deposited");
        System.out.println("Account number: ");
        String accountNumber = scanner.nextLine().trim();
        System.out.println("Amount: ");
        Double amount = Double.valueOf(scanner.nextLine().trim());
        bankservice.deposit(accountNumber, amount, "Deposit");
        System.out.println("Deposited");

    }

    private static void withdraw(Scanner scanner, Bankservice bankservice) {
        System.out.println("Account number: ");
        String accountNumber = scanner.nextLine().trim();
        System.out.println("Amount: ");
        Double amount = Double.valueOf(scanner.nextLine().trim());
        bankservice.withdraw(accountNumber, amount, "withdrawal");
        System.out.println("withdrawn");

    }

    private static void transfer(Scanner scanner, Bankservice bankservice) {
        System.out.println(" From Account ");
        String from = scanner.nextLine().trim();
        System.out.println("To Account ");
        String to = scanner.nextLine().trim();
        System.out.println("Amount ");
        Double amount = Double.valueOf(scanner.nextLine().trim());
        bankservice.transfer(from,to, amount,"Transferd");
    }

    private static void statement(Scanner scanner, Bankservice bankservice) {
        System.out.println(" Account number ");
        String account = scanner.nextLine().trim();
        bankservice.getStatement(account).forEach(t -> {
            System.out.println(t.getTimestamp() + " | " + t.getType() + " | " + t.getAmount() + " | " + t.getNote());
        });

    }

    private static void listAccounts(Scanner scanner, Bankservice bankservice) {
        bankservice.listAccounts().forEach(a -> {
            System.out.println(a.getAccountNumber() + " | " + a.getAccountType() + " | " + a.getBalance());
        });
    }

    private static void searchAccounts(Scanner scanner, Bankservice bankservice) {
        System.out.println("Customer name contains");
        String q = scanner.nextLine().trim();
        bankservice.searchAccountByCustomerName(q).forEach(account ->
                System.out.println(account.getAccountNumber() + " | " + account.getAccountType() + " | " + account.getBalance())
        );


    }


}
