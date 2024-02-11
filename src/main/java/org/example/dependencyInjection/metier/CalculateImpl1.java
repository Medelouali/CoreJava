package org.example.dependencyInjection.metier;

import org.example.dependencyInjection.dao.DoaInterface;

public class CalculateImpl1 implements MetierInterface{
    DoaInterface data;
    @Override
    public void calculate() {
        System.out.println(data.getData());
    }

    public void setData(DoaInterface data) {
        this.data = data;
    }
}
