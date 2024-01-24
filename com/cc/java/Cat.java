package com.cc.java;

public class Cat {

    String name;
    String furColor;
    int age;

    public String tellYourName()
    {
       return this.name;
    }

    public String tellYourFurColor()
    {
       return this.furColor;
    }
    public int tellYourAge()
    {
       return this.age; 
    }
    
    
public void sayHello()
{
    System.out.println("HELLLOOOO");
}

public void tellYourAddress()
{
    System.out.println(this);

}

}
