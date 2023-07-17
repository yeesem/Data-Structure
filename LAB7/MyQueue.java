/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB7;

import java.util.LinkedList;
public class MyQueue<E> {
    protected  LinkedList<E>list = new LinkedList<>();
    
    public MyQueue(){
        
    }
    
    public MyQueue(E[]e){
        for (int i = 0; i < e.length; i++) {
            list.addLast(e[i]);
        }
    }
    
    public void enqueue(E e){
        list.addLast(e);
    }
    
    public E dequeue(){
        E remove = this.list.getFirst();
        this.list.removeFirst();
        return remove;
    }
    
    public E getElement(int i){
        if(i<0 || i>this.getSize()-1)
            return null;
        return this.list.get(i);
    }
    
    public E peek(){
        return this.list.getFirst();
    }
    
    public int getSize(){
        return this.list.size();
    }
    
    public boolean contains(E e){
        return this.list.indexOf(e)>0;
    }
    
    public boolean isEmpty(){
        return this.getSize()==0;
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}
