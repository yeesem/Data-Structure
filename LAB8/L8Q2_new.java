/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB8;

import java.util.Arrays;
import java.util.PriorityQueue;
public class L8Q2_new {
    public static void main(String[] args) {
        String [] name = {"George", "Jim", "John","Blake", "Kevin", "Michael"};
        String [] name2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
        
        PriorityQueue<String>queue = new PriorityQueue<>(Arrays.asList(name));
        PriorityQueue<String>queue2 = new PriorityQueue<>(Arrays.asList(name2));
        
        union(queue,queue2);
        intersection(queue,queue2);
        difference(queue,queue2);
        
        /*
          PriorityQueue<String>union = new PriorityQueue<>(queue);
          union.addAll(queue2);
          PriorityQueue<String>intersection = new PriorityQueue<>(queue);
          intersection.removeAll(queue2);
          PriorityQueue<String>difference = new PriorityQueue<>(queue);
          difference.retainAll(queue2);
        */
        
    }
    
    public static void difference(PriorityQueue name,PriorityQueue name2){
        System.out.print("Difference : ");
        while (!name2.isEmpty()) {
            Object tempt = name2.poll();
            if(name.contains(tempt)){
                name2.remove(tempt);
                name.remove(tempt);
            }
      }
        System.out.println(name.toString());
    }
    
    //Intersection
    public static void intersection(PriorityQueue name,PriorityQueue name1){
        PriorityQueue<String>name2 = new PriorityQueue<>(name1);
        PriorityQueue<String>intersection = new PriorityQueue<>();
        System.out.print("Intersection : ");
        if(name.size()>=name2.size()){
            while (!name2.isEmpty()){
                Object tempt = name2.poll();
                if(name.contains(tempt)){
                    name2.remove(tempt);
                    intersection.add((String)tempt);
                }
            }
        }
        else{
            while (!name.isEmpty()) {
                Object tempt = name.poll();
                if(name2.contains(tempt)){
                    intersection.add((String)tempt);
                    name2.remove(tempt);
                }
            }
        }
        System.out.print(intersection.toString());
        System.out.println();
    }
    
    //Union
    public static void union(PriorityQueue name,PriorityQueue name2){
        PriorityQueue<String>union = new PriorityQueue<>(name);
        union.addAll(name2);
        
        System.out.print("Union : ");
        while (!union.isEmpty()) {
            System.out.print(union.poll());
            if(!union.isEmpty()) System.out.print(", ");
        }
        System.out.println();
    }
}
