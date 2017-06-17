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
    
}
