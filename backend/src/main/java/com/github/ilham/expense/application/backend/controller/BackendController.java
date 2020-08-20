package com.github.ilham.expense.application.backend.controller;

import com.github.ilham.expense.application.backend.model.Expense;
import com.github.ilham.expense.application.backend.service.BackendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BackendController {
    @Autowired
    private BackendService backendService;

    @GetMapping("/expenses/{user}/{month}")
    public String getExpenses(@PathVariable String user, @PathVariable String month) {
        return backendService.getExpenses(user,month);
    }

    @PostMapping("/expenses/publish")
    public String postExpense(@RequestBody Expense expense) {
        return backendService.postExpense(expense);
    }
}
