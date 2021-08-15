package com.company;

import com.company.entities.Car;
import com.company.entities.GasolineEngine;
import com.company.entities.HydrogenEngine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GasolineEngine gasolineEngine = new GasolineEngine();
        HydrogenEngine hydrogenEngine = new HydrogenEngine();

        Car car = new Car(gasolineEngine);

        int action = -1;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("gasoline - 1, hydrogen - 2, print - 3: ");
            action = input.nextInt();

            switch (action){
                case 1:
                    car.setEngine(gasolineEngine);
                    break;
                case 2:
                    car.setEngine(hydrogenEngine);
                    break;
                case 3:
                    car.move();
                    break;
            }
        }
    }
}
