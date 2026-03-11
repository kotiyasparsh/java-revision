package app;

import service.Bankservice;
import service.impl.BankServiceImpl;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;

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
                case "2" -> deposit(scanner);
                case "3" -> withdraw(scanner);
                case "4" -> transfer(scanner);
                case "5" -> satment(scanner);
                case "6" -> listAccounts(scanner);
                case "7" -> searchAccounts(scanner);
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
        bankservice.openAccount(name,email,type);

    }

    private static void deposit(Scanner scanner) {
    }

    private static void withdraw(Scanner scanner) {
    }

    private static void transfer(Scanner scanner) {
    }

    private static void satment(Scanner scanner) {
    }

    private static void listAccounts(Scanner scanner) {

    }

    private static void searchAccounts(Scanner scanner) {
    }


}
