package com.comarch.camp.it.dziedziczenie;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Reksio");
        dog.setRace("Kundel");
        dog.setAge(10);
        dog.setPaw(4);


        System.out.println(dog.getName());
        System.out.println(dog.getRace());
        System.out.println(dog.getAge());
        System.out.println(dog.getPaw());
        dog.bark();
        dog.walk();

        Cat cat = new Cat();
        cat.setName("Puszek");
        cat.setRace("Dachowiec");
        cat.setAge(7);

        System.out.println(cat.getName());
        System.out.println(cat.getRace());
        System.out.println(cat.getAge());
        cat.bark();
        cat.walk();

        Sznaucer sznaucer = new Sznaucer();
        sznaucer.setName("Reks");
        sznaucer.setRace("Sznauceer");
        sznaucer.setAge(1);
        sznaucer.setPaw(4);
        sznaucer.bark();
        sznaucer.broda = 5.5;
        sznaucer.walk();

        Snake snake = new Snake();
        snake.walk();

        Pet p = new Sznaucer();
        Dog d = new Sznaucer();
        Sznaucer s = new Sznaucer();

        if (p instanceof Sznaucer){
            Sznaucer s2 = (Sznaucer) p;
            s2.broda = 6.6;
        } else if (p instanceof Snake){
            Snake snake2 = (Snake) p;
            snake2.walk();
        }
        Pet[] pets = new Pet [3];
        pets[0] = new Snake();
        pets[0].setName("Pyton");
        pets[1] = new Dog();
        pets[1].setName("Rex");
        pets[2] = new Cat();
        pets[2].setName("Puszek");

        for (Pet pet : pets){
            pet.walk();

            Object o = new Snake ();


            Snake s1 = new Snake();
            Snake s2 = new Snake();
            System.out.println(s1.equals(s2));
        }
    }
}
