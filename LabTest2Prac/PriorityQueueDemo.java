/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

import java.util.*;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String>queue = new PriorityQueue<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");
        System.out.println("Priority queue using Comparable:");
   
        while (queue.size()>0) {
            System.out.println(queue.poll());
        }
        
        PriorityQueue<String>queue2 = new PriorityQueue<>(4,Collections.reverseOrder());
        queue2.offer("Oklahoma");
        queue2.offer("Indiana");
        queue2.offer("Georgia");
        queue2.offer("Texas");
        System.out.println("\nPriority queue using comparator : ");
        System.out.println(queue2);  
        
        while (queue2.size()>0) {
            System.out.println(queue2.poll());
        }
    }
} 
