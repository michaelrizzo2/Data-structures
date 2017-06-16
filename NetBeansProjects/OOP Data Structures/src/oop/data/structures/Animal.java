/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.data.structures;

/**
 *
 * @author michael
 */
public class Animal {
    
    //first we need to set the variables
    String name,gender,type;
    int age;
    
    //Now we need to set the constructor
    public Animal( String name,String Gender,int age,String type)
    {
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.type=type;
    }
    
    //now we need to create a sleep and walk method
    public void sleep()
    {
        System.out.println("Animal "+ this.type+ " Has slept");
    }
    
    public void walk()
    {
        System.out.println("Animal "+ this.type+ " Has walked");
    }
    
    public void eat()
    {
        System.out.println("Animal "+this.name+ " has eaten");
    }
}
