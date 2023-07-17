/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

public class TestDList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer>list = new DoublyLinkedList<>();
        
        //Enter data
        list.addFirst(1);
        list.add(1,10);
        list.addLast(100);
        
        list.display();
        
        System.out.println();
        
        //Traverse
        list.traverseForward();
        list.traverseBackward();
        
        System.out.println();
        
        //Remove data
        list.delete(10);
        list.display();
        list.getSize();
        
        //Clear size
        System.out.println();
        list.clear();        
        list.getSize();
        list.display();
    }
}
