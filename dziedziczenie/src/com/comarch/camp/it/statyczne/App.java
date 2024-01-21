package com.comarch.camp.it.statyczne;


public class App {
    public static void main(String[] args) {
Client c1 = new Client();
c1.name = "Janusz";
c1.sername = "Kowalski";

        Client c2 = new Client();
        c2.name = "Max";
        c2.sername = "Kow";


        System.out.println(c1.name);
        System.out.println(c1.sername);

        System.out.println(c2.name);
        System.out.println(c2.sername);
    }
}
