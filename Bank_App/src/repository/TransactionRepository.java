package repository;

import domain.Transaction;

import java.util.*;

public class TransactionRepository {
    private final Map<String, List<Transaction>> txbyAccount = new HashMap<>();

    public void add(Transaction transaction) {
        List<Transaction> list = txbyAccount.computeIfAbsent(transaction.getAccountNumber(),
                k -> new ArrayList<>());
        list.add(transaction);

    }

    public List<Transaction> findByAccount(String account) {
        return new ArrayList<>(txbyAccount.getOrDefault(account, Collections.emptyList()));
    }
}
