package io.swagger.configuration;


import io.swagger.model.Transaction;
import io.swagger.repository.TransactionRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class BankApplicationRunnerConfiguration implements ApplicationRunner {

    private TransactionRepository transactionRepository;

    public BankApplicationRunnerConfiguration(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        List<Transaction> transactionList = Arrays.asList(
                new Transaction("NL01INHO1", "NL02INHO2", 500.73, Transaction.TransactionTypeEnum.TRANSFER, 488558, 1),
                new Transaction("NL01INHO1", "NL02INHO2", 501.73, Transaction.TransactionTypeEnum.TRANSFER, 488558, 1),
                new Transaction("NL01INHO1", "NL02INHO2", 502.73, Transaction.TransactionTypeEnum.TRANSFER, 488558, 1)
        );

        //transactionList.forEach(transactionRepository::save);
        transactionList.forEach(
                transaction->transactionRepository.save(transaction)
        );
    }


    //make a list of transaction here.
}
