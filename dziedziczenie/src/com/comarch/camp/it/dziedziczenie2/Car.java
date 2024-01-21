package com.comarch.camp.it.dziedziczenie2;

public class Car extends Vehicle{

    public Car(String brand, String model) {
        super(brand, model);
        System.out.println(brand + model);
    }
}
