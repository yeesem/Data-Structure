/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

public class Node<E>{
    E element;
    Node <E> next;
    
    public Node(){this.element = null;}
    
    public Node(E element){
        this.element = element;
    }
}
