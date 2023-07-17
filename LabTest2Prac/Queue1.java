/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

import java.util.LinkedList;

public class Queue1 {
    public static void main(String[] args) {
        GenericQueue<String>queue = new GenericQueue<>();
        queue.enqueue("Tom");
        System.out.println(queue);
        
        queue.enqueue("Susan");
        System.out.println(queue);
        
        queue.enqueue("Kim");
        queue.enqueue("Lim");
        
        System.out.println(queue);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        System.out.println(queue);
    }
}

class GenericQueue<E>{
    LinkedList<E>list = new LinkedList<>();
    
    public int getSize(){
        return list.size();
    }
    
    public void enqueue(E item){
        list.addLast(item);
    }
    
    public E dequeue(){
        if(list.isEmpty())
            return null;
        E item = list.getFirst();
        list.remove(0);
        return item;
    }
    
    public E peek(){
        return list.getFirst();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    
    public boolean search(E item){
        return list.contains(item);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
