/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E>{
    private DNode<E>head;
    private DNode<E>tail;
    int size = 0;
    
    public DoublyLinkedList(){
       this.head = null;
       this.tail = null;
    }
    
    public void addFirst(E e){
        DNode<E>firstNode = new DNode<>(null,e,this.head);
        if(this.head!=null){
            firstNode.next = this.head;
            head.prev = firstNode;
            this.head = firstNode;   
        }
        else if(size==0){
            this.head = this.tail = firstNode;
        }
        this.size++;
        System.out.println("adding : " + e);
        /*
        DNode<E>firstNode = new DNode<(null,e,this.head);
        if(head!=null){
           head.prev = firstNode;
        }
        head = firstNode;
        if(tail==null) tail = firstNode;
        this.size++;
        */
    }
    
    public void addLast(E e){
        DNode<E>lastNode = new DNode<>(this.tail,e,null);
        if(this.tail!=null){
            this.tail.next = lastNode;
            lastNode.prev = this.tail; 
            this.tail = lastNode;
        }
        if(size==0){
            this.head = this.tail = lastNode;
        }
        this.size++;
        System.out.println("adding : " + e);
        /*
        DNode<E>lastNode = new DNode<>(tail,e,null);
        if(this.tail!=null){
          tail.next = lastNode;
        }
        tail = lastNode;
        if(head==null){
           head = lastNode;
        }
        this.size++;
        */
    }
    
    public void add(int index,E e){
        if(index<=0) addFirst(e);
        else if(index>=size) addLast(e);
        else{
            int count = 0;
            DNode<E>currentNode = head;
            DNode<E>newNode=new DNode<>(e);
            while (currentNode!=null) {
                if(count==index-1){
                    currentNode.next.prev = newNode;
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    newNode.prev = currentNode;
                }
                count++;
                currentNode = currentNode.next;
            }
            this.size++;
            System.out.println("adding : " + e);
        }
        /*
        if(index<0 || index>size){
          throw new IndexOutOfBoundsException();
        }
        else if(index==0)
          addFirst(e);
        else if(index==size)
          addLast(e);
        else{
          Node<E>tempt = head;
          for(int i=0;i<index;i++){
             tempt = tempt.next;
          }
          DNode<E>insert = new DNode<>(tempt.prev,e,tempt);
          temp.prev.next = insert;
          tempt.prev = insert;
          this.size++;
        }
        */
    }
    
    public void remove(int index){
        E elem = null;
        if(index == 0){
           elem = this.head.element;
           this.head = head.next;
           head.prev = null;
        } 
        else if(index == size-1){
            elem = this.tail.element;
            this.tail = tail.prev;
            tail.next = null;
        }
        else{
        int count = 0;
        DNode<E>currentNode = this.head;
        while (currentNode!=null) {
            if(count == index-1){
                elem = currentNode.next.element;
                currentNode.next = currentNode.next.next;
                currentNode.prev = currentNode; 
            }
            count++;
            currentNode = currentNode.next;
        }
        }
        this.size--;
        System.out.println("Deleted : " + elem);
    }
    
    public void getSize(){
        System.out.println("Size of current doubly linked list : " + this.size);
    }
    
    public void clear(){
        System.out.println("Successfully clear " + this.size + " nodes");
        this.size = 0;
        this.head = this.tail = null;
    }
    
    public void display(){
        System.out.print("Display : ");
        DNode<E>currentNode = this.head;
        while (currentNode!=null) {
            System.out.print(currentNode.element + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    
    public void deleteEnd(){
         if(this.head==null && this.tail==null){
             return;
         }
         this.tail.prev.next = null;
         this.tail = tail.prev;
    }
    
    public void deleteStart(){
        if(this.head == null) return ;
        this.head = this.head.next;
        this.head.prev = null;
    }
    
    public void delete(E e){
        if(this.head.element == e) deleteStart();
        else if(this.head.element == e) deleteEnd();
        else{
        DNode<E>current = this.head;
        while (current!=null) {
            if(current.element.equals(e)){
                current.next.prev = current.prev;
                current.prev.next = current.next;
                break;
            }
            current = current.next;
        }
        this.size--;
      }
    }
    
    public void traverseForward(){
        System.out.println("Iterating forward...");
        DNode<E>current = this.head;
        while (current!=null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public void traverseBackward(){
        System.out.println("Iterating backward...");
        DNode<E>current = this.tail;
        while (current!=null) {
            System.out.print(current.element + " ");
            current = current.prev;
        }
        System.out.println();
    }
    
    //Answer from Dr Ong
    public E removeFirst(){
        if(this.size==0)
            throw new NoSuchElementException();
        DNode<E>tempt = head;
        head = this.head.next;
        head.prev = null;
        this.size--;
        return tempt.element;
    }
    
    public E removeLast(){
        if(this.size==0)
            throw new NoSuchElementException();
        DNode<E>tempt = tail;
        tail = tail.prev;
        tail.next = null;
        tempt.prev = null;
        this.size--;
        return tempt.element;
    }
    
    public E removeAns(int index){
        if(index<0 || index>=size)
            throw new IndexOutOfBoundsException();
        else if(index==0)
            return removeFirst();
        else if(index == size-1)
            return removeLast();
        else{
            DNode<E>tempt = head;
            for (int i = 0; i < index; i++) {
                tempt = tempt.next;
            }
            E elem = tempt.element;
            tempt.prev.next = tempt.next;
            tempt.next.prev = tempt.prev;
            return elem;
        }
    }
    
    public void iterateBackward(){
        DNode<E>tempt = tail;
        while (tempt!=null) {
            System.out.print(tempt.element + " ");
            tempt = tempt.prev;
        }
        System.out.println();
    }
    
    public void clearAns(){
        DNode<E>tempt = head;
        while (head!=null) {
            tempt = head.next;
            head.next = null;
            head.prev = null;
            head = tempt;
        }
        tail.prev = tail.next = null;
        this.size = 0;
    }
}
