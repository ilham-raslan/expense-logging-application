package com.github.ilham.expense.application.backend.repository;

import com.github.ilham.expense.application.backend.model.Expense;
import org.springframework.data.repository.CrudRepository;

public interface BackendRepository extends CrudRepository<Expense,Long>, BackendRepositoryCustom {
}
