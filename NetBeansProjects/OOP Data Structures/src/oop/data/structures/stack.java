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
public class stack {
    
    private int max_size;
    private long stackarray[];
    private int top;
    
    //This wil set up the array
    public stack(int size)
    {
        this.max_size=size;
        this.stackarray=new long[max_size];
        this.top=-1;
    }
    
    public void push(long j)
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
        if(isFull())
        {
        int old_top=top;
        top--;
         return stackarray[old_top];
        }
        else
        {
            System.out.println("The stack is empty");
        }
       
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
