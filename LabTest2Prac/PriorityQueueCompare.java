/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueCompare {
    public static void main(String[] args) {
        PriorityQueueComparable prc = new PriorityQueueComparable();
        PriorityQueue<String>queue = new PriorityQueue<>(4,prc);
        queue.offer("Jason");
        queue.offer("Peter");
        queue.offer("Lee");
        queue.offer("zyyyyyyyyyyyyyy");
        System.out.println(queue.toString());
    }
}

class PriorityQueueComparable implements Comparator<String>{
    
    @Override
    public int compare(String s1,String s2) {
        if(s1.length()>s2.length())
            return 1;
        if(s1.length()<s2.length())
            return -1;
        return 0;
    }
    
}
