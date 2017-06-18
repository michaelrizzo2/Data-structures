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
public class Appchar {
    
    public static void main(String[] args) {
        stack my_stack =new stack(10);
        my_stack.push(20);
        my_stack.push(20);
        my_stack.push(20);
        my_stack.push(20);
        my_stack.push(20);
        my_stack.push(20);
        my_stack.push(20);
        my_stack.push(20);
        my_stack.push(20);
        my_stack.push(20);
        my_stack.push(20);
        my_stack.push(20);
        
        //outputting the elements in the stack
        while(!my_stack.isEmpty())
        {
            System.out.println("Element is " +my_stack.pop());
        }
}
    
    public static String reverser(String string)
    {
        //first we need to get the length of the string to set up the stack
        int stack_size=string.length();
        //we need to push the elements onto the stack
        
        return string;
    }
}
