package com.comarch.camp.it.stringi;

public class Circle {
   private int radius;
    private double field;
    private double circuit;



    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Object)){
            return false;
        }
        Circle circle = (Circle) obj;
        return (this.radius == circle.radius);
        }

    public Circle(int radius) {
        this.radius = radius;
        this.field = 3.14 * radius * radius;
        this.circuit = 2 * 3.14 * radius;

    }
}
