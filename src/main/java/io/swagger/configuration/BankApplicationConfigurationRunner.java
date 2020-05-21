package io.swagger.configuration;

import io.swagger.model.Transaction;
import io.swagger.repository.TransactionRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Component
@ConditionalOnProperty(prefix = "Banking_application.autorun", name = "enabled", havingValue = "true", matchIfMissing = true)
@Transactional
public class BankApplicationConfigurationRunner implements ApplicationRunner {

    private TransactionRepository transactionRepository;

    public BankApplicationConfigurationRunner(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        //System.out.println("sisa is lame");

         List<Transaction> transactionList = Arrays.asList(
                 new Transaction("NL01INHO1c",
                         "NL02INHO2",
                         503.73,
                         Transaction.TransactionTypeEnum.TRANSFER,
                         1),
                 new Transaction("NL01INHO1b",
                         "NL02INHO2",
                         502.73,
                         Transaction.TransactionTypeEnum.TRANSFER,
                         1),
                 new Transaction("NL01INHO1a",
                         "NL02INHO2",
                         501.73,
                         Transaction.TransactionTypeEnum.WITHDRAW,
                         1)
         );

        for (Transaction transaction : transactionList) {
            transactionRepository.save(transaction);
        }

        for (Transaction transaction : transactionRepository.findAll()) {
            System.out.println(transaction);
        }



    }


}
