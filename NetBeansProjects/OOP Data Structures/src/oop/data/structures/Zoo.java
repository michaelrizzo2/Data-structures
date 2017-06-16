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


public class Zoo {
    public static void main(String[] args) { 
    
    //Now we need to set the animal objects
    Animal zebra=new Animal("Pol", "Male", 11, "Zebra");
    zebra.sleep();
    zebra.walk();
    zebra.eat();
    
    Animal giraffe=new Animal("Necky","Female",23,"Giraffe");
    giraffe.sleep();
    giraffe.walk();
    giraffe.eat();
    
    
}
}
