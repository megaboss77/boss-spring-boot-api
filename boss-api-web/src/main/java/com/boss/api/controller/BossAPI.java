package com.boss.api.controller;

import com.boss.api.domain.AccountLoan;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

public class BossAPI {



    // GET: /v1/accounts/loans/{accountId}/payment

    // Define information of this API for displaying on Swagger
    @ApiOperation(value = "Inquiry a student", nickname = "getStudent", notes = "This API is used for inquiry a student.")
    // Define information of HTTP response for this API for displaying on Swagger
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success", response = AccountLoan.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 409, message = "Conflict"),
            @ApiResponse(code = 500, message = "Internal server error occurred"),
            @ApiResponse(code = 503, message = "Service Unavailable"),
            @ApiResponse(code = 504, message = "Gateway Timeout")})
    @RequestMapping(value = "/v1/accounts/loans/{accountId}/payment", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    String getAccountLoan(@NotBlank
                       @ApiParam(name = "accountId", value = "Id of the Student", required = true)
                       @PathVariable(value = "studentId") Integer studentId,
                           HttpServletRequest request) throws Exception {

        //log.info(HostInfo.getHostAddressForLog() + " " + request.getMethod() + " " + HostInfo.getFullURL(request) + " INITIATED...");

        return "HELLO";
    }
}
