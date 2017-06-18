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
public class stackchar {
    
    private int max_size;
    private char stackarray[];
    private int top;
    
    //This wil set up the array
    public stackchar(int size)
    {
        this.max_size=size;
        this.stackarray=new char[max_size];
        this.top=-1;
    }
    
    public void push(char j)
    {
        if (!isFull())
        {
        top++;
        stackarray[top]=j;
        }
        
        else 
        {
            System.out.println("You have exceeded the bounds of the array");
        }
        
        
    }
    
    public long pop()
    {
        int old_top=top; 
        top--;
        return stackarray[old_top];  
    }
    
    public long peek()
    {
        return stackarray[top];
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
    
    public boolean isFull()
    {
        return top==max_size-1;
    }
    
    
    
    
}
