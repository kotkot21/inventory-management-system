package com.InventoryManagmentSystem.IMS.Service;

import com.InventoryManagmentSystem.IMS.Entity.Transaction;
import com.InventoryManagmentSystem.IMS.Repository.TransactionRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepositry transactionRepositry;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepositry.save(transaction);
    }
    public List<Transaction> getAllTransactions() {
        return transactionRepositry.findAll();
    }
    public String deleteTransaction(Integer Id) {
        transactionRepositry.deleteById(Id);
        return "Transaction deleted";
    }
    public String updateTransaction(Integer id,Transaction transaction) {
        transactionRepositry.save(transaction);
        return "Transaction updated";
    }

}
