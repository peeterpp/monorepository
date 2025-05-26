package com.example.pasir_polinski_piotr.controller;

import com.example.pasir_polinski_piotr.dto.GroupTransactionDTO;
import com.example.pasir_polinski_piotr.model.User;
import com.example.pasir_polinski_piotr.service.GroupTransactionService;
import com.example.pasir_polinski_piotr.service.TransactionService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GroupTransactionGraphQLController {

    private final GroupTransactionService groupTransactionService;
    private final TransactionService transactionService;

    public GroupTransactionGraphQLController(GroupTransactionService groupTransacionService, TransactionService transactionService) {
        this.groupTransactionService = groupTransacionService;
        this.transactionService = transactionService;
    }

    @MutationMapping
    public Boolean addGroupTransaction(@Argument GroupTransactionDTO groupTransactionDTO) {
        User user = transactionService.getCurrentUser();
        groupTransactionService.addGroupTransaction(groupTransactionDTO, user);
        return true;
    }
}
