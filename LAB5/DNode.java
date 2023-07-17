/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

public class DNode<E>{
    public E element;
    public DNode<E> next;
    public DNode<E> prev;
    
    public DNode(E e){
        this.prev = null;
        this.element = e;
        this.next = null;
        //this(null,e,null);
    }
    
    public DNode(DNode<E>prev,E e,DNode<E>next){
        this.prev = prev;
        this.element = e;
        this.next = next;
    }
}
