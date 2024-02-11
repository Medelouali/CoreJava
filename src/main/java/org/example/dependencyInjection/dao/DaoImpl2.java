package org.example.dependencyInjection.dao;

public class DaoImpl2 implements DoaInterface{
    @Override
    public String getData() {
        return "DoaImpl2 implementation is injected here";
    }
}
