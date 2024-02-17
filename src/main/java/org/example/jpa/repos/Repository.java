package org.example.jpa.repos;

import org.example.jpa.enums.AccountType;

import java.util.List;

public interface Repository <T>{
    T save(T entity);
    List<T> findAll();
    T getByType(AccountType accountType);
    T findByCode(Long code);
    T remove(T entity);
    T update(T entity);
}
