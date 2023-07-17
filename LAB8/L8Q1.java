/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB8;

public class L8Q1 {
    public static void main(String[] args) {
        Integer [] arr = {4, 8, 1, 2, 9, 6, 3, 7};
        PriorityQueue_test<Integer>queue = new PriorityQueue_test<>(arr);
        
        //Display the queue
        System.out.println("Display : " + queue.toString());
        
        //Retrieve and remove the first element in this priority queue
        System.out.println("poll : " + queue.poll());
        
        //Display the queue after polling
        queue.display();
        
        //Add 5 to queue
        queue.add(5);
        queue.display();
        
        //Convert to array
        Integer [] tempt = queue.toArray();
        System.out.print("Display in array: ");
        for (int i = 0; i < tempt.length; i++) {
            System.out.print(tempt[i] + " ");
        }
        System.out.println();
        
        //Check contains value
        System.out.println("Check 1 value : " + queue.contains(1));
        
        //Display size
        System.out.println("Size : " + queue.getSize());
        
        //isEmpty method
        //queue.isEmpty();
        //System.out.println("Size after isEmpty method : " + queue.getSize());
        //queue.display();
        
        queue.sort();
        System.out.println("Reverse");
        queue.display();
    }
}
