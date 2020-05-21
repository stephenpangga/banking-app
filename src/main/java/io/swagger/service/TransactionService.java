package io.swagger.service;


import io.swagger.model.Transaction;
import io.swagger.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionService() {
    }

    public List<Transaction> getAllTransactions()
    {
        return (List<Transaction>) transactionRepository.findByOrderBySender();
    }
}
