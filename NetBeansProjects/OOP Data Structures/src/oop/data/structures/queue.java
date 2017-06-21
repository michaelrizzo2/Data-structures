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
public class queue {
    
    //Setting up the variables
    private int maxsize;//maintains set number of slots
    private long[] queuearray;
    private int front;
    private int back;
    private int nitems;//This will count the number of items
    
    //Setting up the constructor for the queue array
    public queue(int size)
    {
        this.maxsize=size;
        this.queuearray=new long[size];
        front=0;
        back=-1;//There is no item set to be the back item yet.
        nitems=0;
    }
    
    public void insert(long j)
    {
        if (back==maxsize-1)
        {
            back=-1;
        }
        back++;
        queuearray[back]=j;
        nitems++;
    }
    
    public long remove()
    {
        long value=queuearray[front];
        front++;
        if (front==maxsize)
        {
            front=0;
        }
        nitems--;
        return value;
    }
    
    public long peekfront()
    {
        return queuearray[front];
    }
    
    public boolean isempty()
    {
        return nitems==0;
    }
    
    public boolean isfull()
    {
        return nitems==maxsize;
    }
    public void view()
    {
        for (int i=0;i<queuearray.length;i++)
        {
            System.out.println("The element is "+queuearray[i]);
        }
    }
    
}
