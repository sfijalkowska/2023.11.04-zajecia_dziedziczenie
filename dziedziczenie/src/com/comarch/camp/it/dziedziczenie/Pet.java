package com.comarch.camp.it.dziedziczenie;

public class Pet {
    private String name;
    private String race;
    private int age;

    public Pet(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void walk (){
        System.out.println("Idę na 4 łapach");
    }
}
