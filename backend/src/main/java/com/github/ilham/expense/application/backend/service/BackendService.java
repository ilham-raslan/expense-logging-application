package com.github.ilham.expense.application.backend.service;

import com.github.ilham.expense.application.backend.model.Expense;
import org.springframework.stereotype.Service;

@Service
public class BackendService {
    public String getExpenses(String user, String month) {
        return user + " paid x amount in " + month;
    }

    public String postExpense(Expense expense) {
        return "Posted " + expense.toString();
    }
}
