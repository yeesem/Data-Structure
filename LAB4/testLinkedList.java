/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

public class testLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character>list = new MyLinkedList<>();
        list.addFirst('a');
        list.add(1,'b');
        list.add(2,'c');
        list.add(3,'d');
        list.addLast('e');
        
        //Print 
        System.out.print("Print all the elements : ");
        list.print();
        
        //Reverse
        System.out.print("Reverse : ");
        Node rev = list.reverse();
        while (rev!=null) {
            System.out.print(rev.element + " ");
            rev = rev.next;
        }
        System.out.println();
        
        //Retrive the number of elements in the list
        System.out.println("Number of elements : "+(list.indexOf(list.getLast())+1)); 
        
        //Retrive the first and last value
        System.out.println("Retrive the first element : " + list.getFirst());
        System.out.println("Retrieve the last element : " + list.getLast());
        
        //Delete the third value
        System.out.println("Remove : " + list.remove(3));
        System.out.print("All the elements after removed : ");
        list.print();
        
        //Retrive the index location of second and third values
        System.out.println("Index location of b : " + list.indexOf('b'));
        System.out.println("Index location of c : " + list.indexOf('c'));
        
        //Check the list has the value 'c'
        System.out.println("Value checking : " + list.contains('c'));
        
        //Replace the items individually with the following: j,a,v,a
        System.out.print("Elements after replacement : ");
        list.set(0,'j');
        list.set(1,'a');
        list.set(2,'v');
        list.set(3,'a');
        list.print();
        
        //Get middle value
        System.out.println("Get middle value : " + list.getMiddleValue());
        
        //Clear
        list.clear();
        System.out.print("After clear : ");
        list.print();
    }
}
