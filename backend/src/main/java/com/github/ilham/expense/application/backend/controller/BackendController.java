package com.github.ilham.expense.application.backend.controller;

import com.github.ilham.expense.application.backend.model.Expense;
import com.github.ilham.expense.application.backend.service.BackendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class BackendController {
    @Autowired
    private BackendService backendService;

    @GetMapping("/expenses/all")
    public List<Expense> getAllExpenses() {
        return backendService.getAllExpenses();
    }

    @GetMapping("/expenses/{user}/{month}/{year}")
    public Map<String,Object> getExpenses(@PathVariable String user, @PathVariable int month, @PathVariable int year) {
        return backendService.getExpenses(user,month,year);
    }

    @PostMapping("/expenses/publish")
    public Expense postExpense(@RequestBody Expense expense) {
        return backendService.postExpense(expense);
    }
}
