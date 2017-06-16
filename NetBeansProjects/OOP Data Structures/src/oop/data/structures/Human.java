package oop.data.structures;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Human 

{
    //setting properties of human class
    String name,eyecolor;
    int age,height;

    //setting up constructor
    public Human(String name,int age,String eyecolor,int height)
    {
        this.name=name;
        this.age=age;
        this.eyecolor=eyecolor;
        this.height=height;
        
        
    }
    //setting methods
    public void speak()
            
    {
        System.out.println("My Name is "+ this.name);
        System.out.println("I am "+this.height+ " Tall");
        System.out.println("I am "+ this.age + " years old");
        System.out.println("My eye color is "+ this.eyecolor);
    }
    
    public void eat()
    {
        System.out.println("eating");
    }
    
    public void walk()
    {
        System.out.println("eating");
        
    }
    
    public void work()
    {
        System.out.println("Working");
    }
    
}
