package com.github.ilham.expense.application.backend.repository;

import java.util.List;

public interface BackendRepositoryCustom {
    List<List<Object>> getCategorisedExpensesByUserMonthAndYear(String user, int month, int year);
}
