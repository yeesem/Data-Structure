/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

import java.util.ArrayList;
import java.util.EmptyStackException;


public class Stack1 {
    public static void main(String[] args) {
        GenericStack<String>stack = new GenericStack<>();
        stack.push("Tom");
        System.out.println("(1) " + stack);
        
        stack.push("Susan");
        System.out.println("(2) " + stack);
        
        stack.push("Kim");
        stack.push("Michael");
        System.out.println("(3) " + stack);
        
        // Remove the elements from the stack
        System.out.println("(4) " + stack.pop());
        System.out.println("(5) " + stack.pop());
        System.out.println("(6) " + stack);
        
        
        System.out.println("Find \"Adam\" " + stack.search("Adam"));
        
        GenericStack<Integer>stack2 = new GenericStack<>();
        for (int i = 0; i < 10; i++) {
            stack2.push(i);
        }
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += stack2.pop();
        }
        System.out.println("Sum : " + sum);
    }
}

class GenericStack<E>{
    private ArrayList<E>list = new ArrayList<>();
    
    public int getSize(){
        return list.size();
    }
    
    public E peek(){
        if(list.isEmpty())
            throw new EmptyStackException();
        return list.get(list.size()-1);
    }
    
    public void push(E item){
        list.add(item);
    }
    
    public E pop(){
        if(list.isEmpty())
            throw new EmptyStackException();
        E tempt = list.get(list.size()-1);
        list.remove(list.size()-1);
        return tempt;
    }
    
    @Override
    public String toString(){
        return "Stack : " + list.toString();
    }
    
    public boolean search(E item){
        return list.contains(item);
    }
}
