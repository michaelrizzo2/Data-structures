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
        
        
        String reverse = reverser("String is string");
        System.out.println(reverse);
        
}
    
    public static String reverser(String string)
    {
        //first we need to get the length of the string to set up the stack
        int stack_size=string.length();
        //This will be for the reversed string
        String reversed_string="";
        //we need to set up the stack
        stackchar string_stack=new stackchar(stack_size);
        //now we need to push the elements onto the stack
        for (int i=0;i<stack_size;i++)
        {
            string_stack.push(string.charAt(i));           
        }
        
        //now we need to pop the elements onto the stack to reverse the string
        while (!string_stack.isEmpty())
        {
            reversed_string+=string_stack.pop();
        }
        return reversed_string;
    }
}
