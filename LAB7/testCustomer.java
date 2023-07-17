/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB7;

import java.util.Collections;
import java.util.PriorityQueue;
public class testCustomer {
    public static void main(String[] args) {
        PriorityQueue<Customer>queue = new PriorityQueue<>(1,Collections.reverseOrder());
        queue.offer(new Customer(3,"Donald"));
        queue.offer(new Customer(1,"Chong"));
        queue.offer(new Customer(2,"Ali"));
        queue.offer(new Customer(4,"Bala"));
        
        Customer c = queue.peek();
        
        if(c!=null){
            System.out.println("Id : " + c.getId() + ", Name: " + c.getName());
            while((c=queue.poll())!=null) {
                System.out.println(c);
            }
        }
        System.out.println();
    }
}
