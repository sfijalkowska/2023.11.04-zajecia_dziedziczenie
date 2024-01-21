package com.comarch.camp.it.dziedziczenie;

public class Sznaucer extends Dog {
   public double broda;


   @Override
   void bark() {
      super.bark();
      System.out.println("Dodatkowe Hau!");
   }
}
