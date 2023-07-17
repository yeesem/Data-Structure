/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB8;

public class L8Q2 {
    public static void main(String[] args) {
        String [] name1 = {"George", "Jim", "John","Blake", "Kevin", "Michael"};
        String [] name2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
        
        PriorityQueue_test<String> queue1 = new PriorityQueue_test<>(name1);
        PriorityQueue_test<String> queue2 = new PriorityQueue_test<>(name2);
        
        System.out.println( queue2.getFrequency("George"));
        queue1.Union(queue2);
        queue1.Intersection(queue2);
    }
}
