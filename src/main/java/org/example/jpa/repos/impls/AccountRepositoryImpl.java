package org.example.jpa.repos.impls;

import org.example.jpa.entities.Account;
import org.example.jpa.enums.AccountType;
import org.example.jpa.repos.Repository;
import org.example.jpa.singletons.EntityManagerFactorySingleton;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryImpl implements Repository<Account> {
    private final EntityManagerFactory entityManagerFactory;

    public AccountRepositoryImpl() {
        entityManagerFactory=EntityManagerFactorySingleton.getEntityManagerFactory();
    }

    @Override
    public Account save(Account account) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        try {
            entityManager.persist(account);
            entityTransaction.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            entityTransaction.rollback();
        }
        return  account;
    }

    @Override
    public List<Account> findAll() {
        List<Account> accountsList=new ArrayList<>();
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        try {
            TypedQuery<Account> query = entityManager.createQuery("select acc from Account acc", Account.class);
            accountsList= query.getResultList();
            entityTransaction.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            entityTransaction.rollback();
        }
        return accountsList;
    }

    @Override
    public Account getByType(AccountType accountType) {
        Account account=new Account();
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        try {
            TypedQuery<Account> query=entityManager.createQuery("select acc from Account as acc where acc.accountType=:type", Account.class);
            query.setParameter("type", accountType);
            account=query.getSingleResult();
            entityTransaction.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            entityTransaction.rollback();
        }
        return  account;
    }

    @Override
    public Account findByCode(Long code) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        try {
            Account account= entityManager.find(Account.class, code);
            entityTransaction.commit();
            return account;
        }catch (Exception e){
            System.out.println(e.getMessage());
            entityTransaction.rollback();
        }
        return null;
    }

    @Override
    public Account remove(Account entity) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        try {
            Account account= entityManager.find(Account.class, entity.getCode());
            entityManager.remove(account);
            entityTransaction.commit();
            return account;
        }catch (Exception e){
            System.out.println(e.getMessage());
            entityTransaction.rollback();
        }
        return null;
    }

    @Override
    public Account update(Account entity) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        try {
            Account account= entityManager.merge(entity);
            entityTransaction.commit();
            return account;
        }catch (Exception e){
            System.out.println(e.getMessage());
            entityTransaction.rollback();
        }
        return null;
    }
}
