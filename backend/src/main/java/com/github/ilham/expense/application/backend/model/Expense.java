package com.github.ilham.expense.application.backend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue
    private long id;
    private Date date;
    private String username;
    private String description;
    private String category;
    private double amount;
}
