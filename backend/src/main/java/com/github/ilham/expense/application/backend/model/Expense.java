package com.github.ilham.expense.application.backend.model;

import lombok.Data;

import java.util.Date;

@Data
//@Entity
public class Expense {
//    @Id
//    @GeneratedValue
    private long id;
    private Date date;
    private String user;
    private String category;
    private double amount;
}
