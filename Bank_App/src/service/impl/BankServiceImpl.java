package service.impl;

import domain.Account;
import domain.Customer;
import domain.Transaction;
import domain.Type;
import repository.AccountRepository;
import repository.CustomerRepsitory;
import repository.TransactionRepository;
import service.Bankservice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class BankServiceImpl implements Bankservice {

    private final AccountRepository accountRepository = new AccountRepository();
    private final TransactionRepository transactionRepository = new TransactionRepository();
    private final CustomerRepsitory customerRepsitory = new CustomerRepsitory();
    @Override
    public String openAccount(String name, String email, String accountType) {

        String customerId = UUID.randomUUID().toString();

        String accountNumber = getAccountNumber();
        Account account = new Account(accountNumber, customerId, 0.0, accountType);

        accountRepository.save(account);

        return accountNumber;
    }

    @Override
    public List<Account> listAccounts() {
        return accountRepository.findAll().stream()
                .sorted(Comparator.comparing(Account::getAccountNumber))
                .collect(Collectors.toList());

    }

    @Override
    public void deposit(String accountNumber, Double amount, String note) {
        Account account = accountRepository.findByNumber(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found" + accountNumber));
        account.setBalance(account.getBalance() + amount);
        Transaction transaction = new Transaction(account.getAccountNumber(),  UUID.randomUUID().toString(),amount, LocalDateTime.now(), note , Type.DEPOSIT);
        transactionRepository.add(transaction);

    }

    @Override
    public void withdraw(String accountNumber, Double amount, String note) {
        Account account = accountRepository.findByNumber(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found" + accountNumber));
        if(account.getBalance().compareTo(amount) < 0)
            throw new RuntimeException("Insufficient Balance");
        account.setBalance(account.getBalance() - amount);
        Transaction transaction = new Transaction(account.getAccountNumber(),
                UUID.randomUUID().toString(),amount, LocalDateTime.now(), note , Type.WITHDRAW);
        transactionRepository.add(transaction);
    }

    @Override
    public void transfer(String fromAcc, String toAcc,Double amount, String note) {
        if(fromAcc.equals(toAcc))
            throw new RuntimeException("CANNOT TRANSFER TO YOUR OWN ACCOUNT");
        Account from = accountRepository.findByNumber(fromAcc)
                .orElseThrow(() -> new RuntimeException("Account not found" + fromAcc));
        Account to = accountRepository.findByNumber(toAcc)
                .orElseThrow(() -> new RuntimeException("Account not found" + toAcc));
//        validation for account balance
        if(from.getBalance().compareTo(amount) < 0)
            throw new RuntimeException("Insufficient Balance");

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

//        inline object creating
        transactionRepository.add( new Transaction(from.getAccountNumber(),
                UUID.randomUUID().toString(),amount, LocalDateTime.now(), note , Type.TRANSFER_OUT));

        transactionRepository.add( new Transaction(to.getAccountNumber(),
                UUID.randomUUID().toString(),amount, LocalDateTime.now(), note , Type.TRANSFER_IN));

    }

    @Override
    public List<Transaction> getStatement(String account) {
        return transactionRepository.findByAccount(account).stream()
                .sorted(Comparator.comparing(Transaction::getTimestamp))
                .collect(Collectors.toList());
    }

    @Override
    public List<Account> searchAccountByCustomerName(String q) {
        String query = (q == null) ? "" : q.toLowerCase();
        List<Account> result = new ArrayList<>();
        for(Customer c : customerRepsitory.findAll()){
            if(c.getName().toLowerCase().contains(query))
                result.addAll(accountRepository.findByCustomerId(c.getId()));
        }
        result.sort(Comparator.comparing(Account:: getAccountNumber));
        return result;
    }


    private String getAccountNumber() {
        int size = accountRepository.findAll().size() + 1;
        return String.format("AC%06d", size);
    }
}
