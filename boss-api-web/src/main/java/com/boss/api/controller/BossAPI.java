package com.boss.api.controller;

import com.boss.api.domain.AccountLoan;
import com.boss.api.repository.AccountLoanRepository;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

@Transactional
@RefreshScope
@RestController
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableSwagger2
@Api(tags = "Boss.Api", value = "v1", description = "BOSS API")
@RequestMapping(value = "/v1")
public class BossAPI {

    @Autowired
    private AccountLoanRepository accountLoanRepository;



    // GET: /v1/accounts/loans/{accountId}/payment

    // Define information of this API for displaying on Swagger
    @ApiOperation(value = "Inquiry an account", nickname = "getAccount", notes = "This API is used for inquiry an account.")
    // Define information of HTTP response for this API for displaying on Swagger
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict"),
            @ApiResponse(code = 500, message = "Internal server error occurred"),
            @ApiResponse(code = 503, message = "Service Unavailable"),
            @ApiResponse(code = 504, message = "Gateway Timeout")})
    @RequestMapping(value = "/accounts/loans/{accountId}/payment", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    AccountLoan getAccountLoan(@NotBlank
                       @ApiParam(name = "accountId", value = "Id of the Account", required = true)
                       @PathVariable(value = "accountId") String accountId,
                           HttpServletRequest request) throws Exception {
        AccountLoan mock = new AccountLoan(accountId,"SAVING","5730804234","2020-20-10",5000.0);

        com.boss.api.entity.AccountLoan accountLoanEnt = accountLoanRepository.findOne(accountId);
        System.out.println("TEST_REPO"+accountLoanEnt.getAccountNumber());
        AccountLoan accountLoanDomain = new AccountLoan(accountLoanEnt.getAccountNumber(),
                accountLoanEnt.getAccountType(),
                accountLoanEnt.getDocumentNumber(),
                accountLoanEnt.getEffectiveDate(),
                accountLoanEnt.getTransactionAmount()
        );

        return accountLoanDomain;
    }

    // GET: /v1/accounts/loans/{accountId}/payment

    // Define information of this API for displaying on Swagger
    @ApiOperation(value = "Inquiry an test", nickname = "test", notes = "This API is used for inquiry an account.")
    // Define information of HTTP response for this API for displaying on Swagger
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict"),
            @ApiResponse(code = 500, message = "Internal server error occurred"),
            @ApiResponse(code = 503, message = "Service Unavailable"),
            @ApiResponse(code = 504, message = "Gateway Timeout")})
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    String test(){
        return "HELLO BOSS";
    }
}
