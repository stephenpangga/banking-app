/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Transaction;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-18T19:26:09.389Z[GMT]")
@Api(value = "transactions", description = "the transactions API")
public interface TransactionsApi {

    @ApiOperation(value = "get all transactions with filters", nickname = "getTransactions", notes = "This endpoint will get all transaction that the user have done.", response = Transaction.class, responseContainer = "List", tags={ "Transaction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Transaction has successfully collected.", response = Transaction.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "bad request") })
    @RequestMapping(value = "/transactions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Transaction>> getTransactions(@ApiParam(value = "get all transaction") @Valid @RequestParam(value = "iban", required = false) String iban
    ,@ApiParam(value = "show transaction based on date") @Valid @RequestParam(value = "date", required = false) String date
    ,@ApiParam(value = "show transaction based on max amount") @Valid @RequestParam(value = "max-amount", required = false) Double maxAmount
    ,@ApiParam(value = "show transaction based on min amount") @Valid @RequestParam(value = "min-amount", required = false) Double minAmount
    );


    @ApiOperation(value = "get a specific transaction", nickname = "getTransactionsById", notes = "This endpoint will get one transaction that the user have done.", response = Transaction.class, tags={ "Transaction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Transaction has successfully collected.", response = Transaction.class),
        @ApiResponse(code = 400, message = "bad request") })
    @RequestMapping(value = "/transactions/{transactionId}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Transaction> getTransactionsById(@ApiParam(value = "",required=true) @PathVariable("transactionId") Integer transactionId
);


    @ApiOperation(value = "make a transaction, deposit, withdraw", nickname = "transfer", notes = "this method allows the employee/user to create transaction.", response = Transaction.class, tags={ "Transaction", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Transaction has successfully collected.", response = Transaction.class),
        @ApiResponse(code = 400, message = "bad request"),
        @ApiResponse(code = 403, message = "Insufficient funds") })
    @RequestMapping(value = "/transactions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity transfer(@ApiParam(value = ""  )  @Valid @RequestBody Transaction body
);

}
