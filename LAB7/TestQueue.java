/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB7;

public class TestQueue{
    public static void main(String[] args) {
        String [] fruit = {"Apple","Grapes","Orange","Cherry"};
        MyQueue<String>queue = new MyQueue<>(fruit);
        
        System.out.println("Display the queue : "+ queue.toString());
        System.out.println("Show the top item : "+queue.peek());
        System.out.println("Display the size of the queue : " + queue.getSize());
        System.out.println("Remove the first element : " + queue.dequeue());
        System.out.println("Get the item of index 2 : " + queue.getElement(2));
        System.out.println("Check the element cherry : " + queue.contains("Cherry"));
        System.out.println("Check the element durian : " + queue.contains("durian"));
        System.out.println("Check whether the queue is empty : " + queue.isEmpty());
    }
}
