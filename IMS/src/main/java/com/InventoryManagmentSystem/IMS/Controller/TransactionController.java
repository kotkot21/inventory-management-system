package com.InventoryManagmentSystem.IMS.Controller;

import com.InventoryManagmentSystem.IMS.Entity.Transaction;
import com.InventoryManagmentSystem.IMS.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping()
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }
    @GetMapping()
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }
    @DeleteMapping("{id}")
    public String deleteTransaction(@PathVariable Integer id) {
        return transactionService.deleteTransaction(id);
    }
    @PutMapping("{id}")
    public String updateTransaction(@PathVariable Integer id, @RequestBody Transaction transaction) {
        return transactionService.updateTransaction(id, transaction);
    }
}
