package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Objekt erzeugen
        Cat cat = new Cat(); 
        System.out.println(cat);

        // Wertzuweisung
        cat.name = "Alonzo";
        cat.furColor = "grey";
        cat.age = 35;

        // Ausgabe
        // System.out.println(cat.tellYourName());
        // System.out.println(cat.tellYourFurColor());
        // System.out.println(cat.tellYourAge());

       output(cat.tellYourName());
       output(cat.tellYourFurColor());
       output(String.valueOf(cat.tellYourAge()));

       


        System.out.println("---------------");

        Cat cat2 = new Cat();
        System.out.println(cat2);
      
        // Wertzuweisung
        cat2.name = "Grizabella";
        cat2.furColor = "white";
        cat2.age = 29;

        // Ausgabe
        System.out.println(cat2.tellYourName());
        System.out.println(cat2.tellYourFurColor());
        System.out.println(cat2.tellYourAge());
        
        output(cat2.tellYourName());
        output(cat2.tellYourFurColor());
        output(String.valueOf(cat2.tellYourAge()));

    }

    public static void output(String outputString)
    {

        System.out.println(outputString);

    }
}