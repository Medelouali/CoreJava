package org.example.dependencyInjection.dao;

public class DaoImpl1 implements DoaInterface{
    @Override
    public String getData() {
        return "DoaImpl1 implementation is injected here";
    }
}
