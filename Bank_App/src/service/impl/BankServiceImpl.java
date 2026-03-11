package service.impl;

import domain.Account;
import repository.AccountRepository;
import service.Bankservice;

import java.util.List;
import java.util.UUID;

public class BankServiceImpl implements Bankservice {


    @Override
    public String openAccount(String name, String email, String accountType) {



        public class BankServiceImpl implements Bankservice {


            @Override
            public String openAccount(String name, String email, String accountType) {




                 AccountRepository accountRepository = new AccountRepository();

                String customerId = UUID.randomUUID().toString();

                String accountNumber = getAccountNumber(accountRepository);
                Account account = new Account(accountNumber, customerId, 0.0, accountType);

                accountRepository.save(account);
                return accountNumber;
            }

            @Override
            public List<Account> listAccounts() {
                return accountRepository.findAll();
            }

            private static String getAccountNumber(AccountRepository accountRepository) {
                int size = accountRepository.findAll().size() +1;
                String accountNumber = String.format("AC%06d",size);
                return accountNumber;

//        in line --> return String.format("AC%06d",size);
            }


        }



         AccountRepository accountRepository = new AccountRepository();

        String customerId = UUID.randomUUID().toString();

        String accountNumber = getAccountNumber(accountRepository);
        Account account = new Account(accountNumber, customerId, 0.0, accountType);

        accountRepository.save(account);
        return accountNumber;
    }

    @Override
    public List<Account> listAccounts() {
        return accountRepository.findAll();
    }

    private static String getAccountNumber(AccountRepository accountRepository) {
        int size = accountRepository.findAll().size() +1;
        String accountNumber = String.format("AC%06d",size);
        return accountNumber;

//        in line --> return String.format("AC%06d",size);
    }


}
