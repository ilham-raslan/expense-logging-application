package com.github.ilham.expense.application.backend.service;

import com.github.ilham.expense.application.backend.model.Expense;
import com.github.ilham.expense.application.backend.repository.BackendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BackendService {
    @Autowired
    private BackendRepository backendRepository;

    public Map<String,Object> getExpenses(String user, int month, int year) {
        List<List<Object>> categorisedExpenses = backendRepository.getCategorisedExpensesByUserMonthAndYear(user,month,year);

        Map<String,Object> categorisedExpensesMap = new HashMap<>();

        for (List<Object> list : categorisedExpenses) {
            categorisedExpensesMap.put((String) list.get(0),list.get(1));
        }

        return categorisedExpensesMap;
    }

    public Expense postExpense(Expense expense) {
        return backendRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return (List<Expense>) backendRepository.findAll();
    }
}
