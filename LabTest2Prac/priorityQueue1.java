/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
public class priorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer>queue = new PriorityQueue<>();
        int [] num = {4, 8, 1, 2, 9, 6, 3, 7};
        for (int i = 0; i < num.length; i++) {
            queue.offer(num[i]);
        }
        
        System.out.println(queue.toString());
        System.out.println(queue.poll());
        Object [] tempt = queue.toArray();
        
        System.out.println();
        for (int i = 0; i < tempt.length; i++) {
            System.out.print(tempt[i] + ", ");
        }
        System.out.println();
        
        System.out.println(queue.size());
        System.out.println(queue.contains(1));
        System.out.println(queue.isEmpty());
        
        System.out.println();
        
        PriorityQueue<Integer>queue2 = new PriorityQueue<>(Collections.reverseOrder());
        queue2.addAll(queue);
        int size = queue2.size();
        for (int i = 0; i < size; i++) {
            System.out.print(queue2.poll() + ", ");
        }
    }
}
