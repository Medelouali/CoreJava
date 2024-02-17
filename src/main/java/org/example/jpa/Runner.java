package org.example.jpa;

import org.example.jpa.entities.Account;
import org.example.jpa.enums.AccountType;
import org.example.jpa.repos.Repository;
import org.example.jpa.repos.impls.AccountRepositoryImpl;
import org.example.jpa.singletons.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        Account account1=new Account(null, 2023.2, new Date(), AccountType.EPARGNE);
        Account account2=new Account(null, 42330.2, new Date(), AccountType.CREDIT);
        Repository<Account> accountRepository=new AccountRepositoryImpl();
        accountRepository.save(account1);
        accountRepository.save(account2);
        System.out.println(accountRepository.findAll());
        account1.setBalance(2000.22);
        accountRepository.update(account1);
        System.out.println(accountRepository.findAll());
    }
}
