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
public class Earth {
    
    public static void main(String[] args) {
//        Human michael;
//        michael =new Human();
//        //setting properties
//        michael.age=27;
//        michael.eyecolor="Blue";
//        michael.height=60;
//        michael.name="Michael";
//        michael.speak();
//        
//        //we will set up a joe object
//        Human joe =new Human();
//        joe.age=27;
//        joe.name="Joe";
//        joe.height=70;
//        joe.eyecolor="Brown";
//        joe.speak();
        
        Human human1=new Human("Joe",27,"Blue",70);
        human1.speak();
        human1.eat();
        

        
    }
    
}
