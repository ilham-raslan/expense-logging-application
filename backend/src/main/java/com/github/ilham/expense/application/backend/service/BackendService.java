package com.github.ilham.expense.application.backend.service;

import com.github.ilham.expense.application.backend.model.Expense;
import com.github.ilham.expense.application.backend.repository.BackendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackendService {
    @Autowired
    private BackendRepository backendRepository;

    public String getExpenses(String user, String month) {
        return user + " paid x amount in " + month;
    }

    public Expense postExpense(Expense expense) {
        return backendRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return backendRepository.findAll();
    }
}
