/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

import java.util.Collections;
import java.util.PriorityQueue;
public class compareCustomer {
    public static void main(String[] args) {
        PriorityQueue<Customer>queue = new PriorityQueue<>();
        queue.offer(new Customer(3,"Donald"));
        queue.offer(new Customer(1,"Peter"));
        queue.offer(new Customer(2,"James"));
        queue.offer(new Customer(4,"Siti"));
    
        //Customer c = queue.peek();
        //System.out.println(c);
        
        for (Customer tempt = queue.poll();tempt!=null;tempt=queue.poll()) {
            System.out.println(tempt);
        }
            
    }
}

class Customer implements Comparable<Customer>{
    private Integer id;
    private String name;
    
    public Customer(int id,String name){
        this.id = id;
        this.name = name;
    }

    //For compareTo need to use object
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "Customer [ " + this.id + ", name = " + this.name + " ]";
    }
    
    @Override
    public int compareTo(Customer c){
        return this.getName().compareTo(c.getName());
    }
}
