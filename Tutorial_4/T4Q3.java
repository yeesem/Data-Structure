/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_4;

public class T4Q3{
    public static void main(String[] args) {
        Node<Character>node1 = new Node<>('a');
        Node<Character>node2 = new Node<>('b');
        Node<Character>node3 = new Node<>('c');
        Node<Character>node4 = new Node<>('d');
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        test<Character>tempt = new test<>(node1);
        System.out.println(tempt.removeLast());
        System.out.println(tempt.getSize());
    }
}

class test<E>{
    public int size = 1;
    Node head;
    Node tail;
    
    public int getSize(){
        return size;
    }
    
    public test(Node tempt){
        head = tempt;
        while (tempt.next!=null) {
            size++;
            tempt = tempt.next;
        }
        tail = tempt;
    }
    
    public E removeLast(){
        if(head==null && tail == null){
            return null;
        }
        else if(size==1){
            E tempt = (E)head.val;
            tail = head = null;
            this.size=0;
            return tempt;
        }
            Node<E>current = head;
            while (current!=null){
                if(current.next.val == tail.val){
                    E elem = (E) tail.val;
                    tail = current;
                    current.next = null;
                    size--;
                    return elem;
                }
                current = current.next;
            }
            return null;
    }
}

class Node<E>{
    E val;
    Node next;
    public Node(E val){
        this.val = val;
    }
}
