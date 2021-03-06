package io.swagger.api;

import io.swagger.model.Account;
import java.math.BigDecimal;
import io.swagger.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.repository.UserRepository;
import io.swagger.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-18T19:26:09.389Z[GMT]")
@Controller
public class UsersApiController implements UsersApi {

    @Autowired
    private UserService userService;

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<User>> deleteUser(@ApiParam(value = "User id to get from the database",required=true) @PathVariable("userId") Integer userId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"id\" : 20\n}, {\n  \"id\" : 20\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> getUser(@ApiParam(value = "User id to get from the database",required=true) @PathVariable("userId") Integer userId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"id\" : 20\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> getUsers(@ApiParam(value = "The number of items to skip before starting to collect the result set") @Valid @RequestParam(value = "offset", required = false) Integer offset
, @ApiParam(value = "The numbers of items to return") @Valid @RequestParam(value = "limit", required = false) Integer limit
, @ApiParam(value = "First name of the user") @Valid @RequestParam(value = "firstName", required = false) String firstName
, @ApiParam(value = "Last name of the user") @Valid @RequestParam(value = "lastName", required = false) String lastName
, @ApiParam(value = "Access level of this user") @Valid @RequestParam(value = "accessLevel", required = false) BigDecimal accessLevel
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"id\" : 20\n}, {\n  \"id\" : 20\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        //return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);

        return new ResponseEntity<List<User>>(userService.getAllUser(), HttpStatus.OK);
    }

    public ResponseEntity<User> registerUser(@ApiParam(value = "User object to register to the database") @Valid @RequestParam(value = "firstName", required = false) String firstName
, @ApiParam(value = "User object to register to the database") @Valid @RequestParam(value = "lastName", required = false) String lastName
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"id\" : 20\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUser(@ApiParam(value = "User id to get from the database",required=true) @PathVariable("userId") Integer userId
,@ApiParam(value = ""  )  @Valid @RequestBody User body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Account>> usersUserIdAccountsGet(@ApiParam(value = "customer name the account is in",required=true) @PathVariable("userId") String userId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Account>>(objectMapper.readValue("[ {\n  \"accountType\" : \"current\",\n  \"authorId\" : 1\n}, {\n  \"accountType\" : \"current\",\n  \"authorId\" : 1\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Account>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Account>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
