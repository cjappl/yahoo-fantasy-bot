package com.pldfodb.controller;

import com.pldfodb.service.TransactionStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired private TransactionStateService transactionStateService;

    @PostMapping("/")
    public @ResponseBody void updateTransactions() throws IOException {
        transactionStateService.updateTransactions();
    }
}
