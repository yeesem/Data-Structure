/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB8;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
public class L8Q1_new {
    
    public static void main(String[] args) {
        PriorityQueue<Integer>queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(8);
        queue.add(1);
        queue.add(2);
        queue.add(9);
        queue.add(6);
        queue.add(3);
        queue.add(7);
        
        //Display all the elements inside this priority queue.
        System.out.println("Diaplay                  : " + queue.toString());
        
        // retrieve and remove the first element in this priority queue.
        System.out.println("Retrieve first element   : " + queue.poll());
        
        //Adding new element 5 into the priority queue
        System.out.println("Add 5                    :" + queue.add(5));
        
        //convert the priority queue into an array and display.
        Object[]tempt = queue.toArray();
        for (int i = 0; i < tempt.length; i++) {
            System.out.print(tempt[i] + " ");
        }
        System.out.println();
        
        //Display all the elements inside this priority queue.
        System.out.println("Display                  :" + queue.toString());
        
        //retrieve the first element in the priority queue
        System.out.println("Peek                     :" + queue.peek());
        
        //check if the priority queue consists of element “1”.
        System.out.println("Contains 1               : " + queue.contains(1));
        
        //get the current size of the priority queue
        System.out.println("Size                     : " + queue.size());
        
        //Displaying and removing all elements in the priority queue
        System.out.println("IsEmpty                  : " + queue.isEmpty());
        System.out.print("Display and remove : ");
        while (!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
        
        System.out.println("Size after remove  : " + queue.size());
        
        Integer[]arr = {4, 8, 1, 2, 9, 6, 3, 7};
        PriorityQueue<Integer>queue2 = new PriorityQueue<>(Collections.reverseOrder());
        queue2.addAll(Arrays.asList(arr));
        System.out.println("Display : " + queue2.toString());
        System.out.print("Display : ");
        while(!queue2.isEmpty()) {
            System.out.print(queue2.poll() + " ");
        }
        System.out.println();
    }
}
