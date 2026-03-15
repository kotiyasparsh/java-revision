package exception;

import domain.Account;

public class AccountNotFoundException extends RuntimeException{

        public AccountNotFoundException(String message){
            super(message);
        }

}
