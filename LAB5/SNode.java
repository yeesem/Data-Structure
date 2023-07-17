/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

public class SNode<E>{
    E element;
    SNode<E> next;
    public SNode(){
       this.element = null;
       next = null;
    }
    
    public SNode(E element){
        this.element = element;
        next = null;
    }
}


