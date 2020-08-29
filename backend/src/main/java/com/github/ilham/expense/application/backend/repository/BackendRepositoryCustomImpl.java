package com.github.ilham.expense.application.backend.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BackendRepositoryCustomImpl implements BackendRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<List<Object>> getCategorisedExpensesByUserMonthAndYear(String user, int month, int year) {
        String query = "SELECT category,sum(amount) as total FROM (SELECT * FROM [ExpenseApplication].[dbo].[expense] where username='" + user + "' AND MONTH(date)=" + month + " AND YEAR(date)=" + year + ") usernametable GROUP BY category";
        return entityManager.createNativeQuery(query).getResultList();
    }
}
