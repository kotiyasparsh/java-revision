package service;

import domain.Account;

import java.util.List;

public interface Bankservice {

    String openAccount( String name, String email,String accountType);

    List<Account> listAccounts ();
}
