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
public class Nodeapp {
    
    public static void main(String[] args) {
        Node my_node1=new Node();
        my_node1.node_data=4;
        
        Node my_node2=new Node();
        my_node2.node_data=3;
        
        Node my_node3=new Node();
        my_node3.node_data=7;
        
        Node my_node4=new Node();
        my_node4.node_data=8;
        
        //Next we need to link all of the nodes together
        my_node1.next=my_node2;
        my_node2.next=my_node3;
        my_node3.next=my_node4;
    }
    
}
