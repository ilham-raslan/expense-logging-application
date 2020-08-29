package com.github.ilham.expense.application.backend.repository;

import com.github.ilham.expense.application.backend.model.Expense;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BackendRepository extends CrudRepository<Expense,Long>, BackendRepositoryCustom {
    List<Expense> findAll();
    List<List<Object>> getCategorisedExpensesByUserMonthAndYear(String user, int month, int year);
}
