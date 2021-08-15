package com.company.entities;

public class GasolineEngine implements Engine {
    @Override
    public void move() {
        System.out.println("move with gasoline");
    }
}
