/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB6;

import java.util.ArrayList;
import java.util.EmptyStackException;
public class MyStack<E>{
    ArrayList<E>stack;
    
    public MyStack(){
        this.stack = new ArrayList<>();
    }
    
    public void push(E o){
        stack.add(o);
    }
    
    public E pop(){
       if(isEmpty())
           throw new EmptyStackException();
       E tempt = stack.get(stack.size()-1);
       stack.remove(stack.size()-1);
       return tempt;
    }
    
    public E peek(){
        if(isEmpty())
           throw new EmptyStackException();
        return stack.get(stack.size()-1);
    }
    
    public int getSize(){
        return stack.size();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    @Override
    public String toString(){
       return this.stack.toString();
    }
    
    public boolean search(E e){
        return stack.contains(e);
    }
    
}
