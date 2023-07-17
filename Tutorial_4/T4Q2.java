/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_4;

public class T4Q2<E>{
     Node head;
     Node tail;
     
     public boolean operationX(E e) { 
         Node<E>current = head;
         while (current!=null) {
             if(current.val.equals(e))
                 return true;
             current = current.next;
         }
         return false;
     }
}

class Node<E>{
    E val;
    Node next;
    public Node(E e){
      this.val = e;
    }
}
