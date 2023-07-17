/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

import java.util.NoSuchElementException;
import java.util.Scanner;
public class StudentManagementSystem<E> {
    SNode head;
    SNode tail;
    int size = 0;
    public StudentManagementSystem(){
        this.head = null;
        this.tail = null;
    }
    
    public void add(E e){
        SNode<E>newNode = new SNode<>(e);
        if(this.size==0) this.head = this.tail = newNode;
        else{
           this.tail.next = newNode;
           tail = newNode;
        }
        this.size++;
    }
    
    public void removeElement(E e){
        if(size==0) throw new NullPointerException();
        SNode<E>currentNode = this.head;
        if(this.head.element.equals(e)){
            head = head.next;
            this.size--;
            return;
        }
        while (currentNode.next!=null) {
            System.out.println("Enter");
            if (currentNode.next.element.equals(e)) {
                System.out.println("Found");
                currentNode.next = currentNode.next.next;
                this.size--;
                return;
            }
            currentNode = currentNode.next;
        }
    }
    
    public void printList(){
        SNode<E>currentNode = this.head;
        while (currentNode!=null) {
            System.out.print(currentNode.element + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean contains(E e){
        SNode<E>currentNode = new SNode<>(e);
        while (currentNode!=null){
            if(currentNode.element==e){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
    
    public void replace(E e,E newE){
        if (this.size == 0) throw new NullPointerException();
        SNode<E> currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.element.equals(e)) {
                currentNode.element = newE;
                return;
            }
            currentNode = currentNode.next;
        }
        throw new NoSuchElementException();
    }
    
    public static void main(String[] args) {
        
        StudentManagementSystem<String>list = new StudentManagementSystem<>();
        Scanner input = new Scanner(System.in);
        
        //Add names to list
        String name;
        System.out.println("Enter your student name list. Enter 'n' to  end......"); 
        name = input.nextLine();
        while (!name.equalsIgnoreCase("n")) {
            list.add(name);
            name = input.nextLine();
        }
        
        /*
        //Use to do while loop
        do{
          name = input.nextLine();
          if(name.equals("n"))
             break;
          list.add(name);
        }while(!list.equals("n"));
        */
        
        //Display the list
        System.out.println("You have entered the following students' name : ");
        list.printList();
        
        System.out.println();
        
        //Display the number of students inside the list
        System.out.println("The number of students entered is : " + list.getSize());
        
        System.out.println();
        
        //Replace
        char decision;
        System.out.println("All the names are entered correct? Enter 'r' to rename the student's name, 'n' to proceed.");
        decision = input.nextLine().charAt(0);
        
        if(decision=='r'){
            System.out.println("Enter the existing student name that u want to rename:");
            name = input.nextLine();
            System.out.println("Enter the new name : ");
            list.replace(name,input.nextLine());
            
            System.out.println("The new student list is : ");
            list.printList();
        }
        
        System.out.println();
        
        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        decision = input.nextLine().charAt(0);
        
        if(decision == 'y'){
            System.out.println("Enter a student name to remove : ");
            list.removeElement(input.nextLine());
        }
        
        System.out.println();
        
        System.out.println("The number of updated student is : "  + list.getSize());
        System.out.println("The updated student list is : ");
        list.printList();
        
        System.out.println();
        
        System.out.println("All student data captured complete. Thank you!");
    }
}
