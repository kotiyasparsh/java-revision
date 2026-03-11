package domain;

import java.time.LocalDateTime;

public class Transaction {

    private String id;
   private String accountNumber;
   private Double amount;
   private LocalDateTime timestamp;
   private String note;
   private Type type;

    public Transaction(String id, String accountNumber, Double amount, LocalDateTime timestamp, String note, Type type) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.timestamp = timestamp;
        this.note = note;
        this.type = type;
    }


}
