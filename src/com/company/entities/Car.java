package com.company.entities;

public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void move(){
        engine.move();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
