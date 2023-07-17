/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

public class MyLinkedList<E> {
    private int size=0;
    private Node<E>head;
    private Node<E>tail;
    
    public MyLinkedList(){
       head = null;
       tail = null;
    }
    
    public void addFirst(E e){
        Node<E>firstNode = new Node<>(e);
        firstNode.next = this.head;
        this.head = firstNode;
        
        if(this.tail == null){this.tail = this.head;}
        this.size++;
    }
    
    public void addLast(E e){
        Node<E>lastNode = new Node<>(e);
        if(this.tail == null) this.tail = lastNode;
        else{
          this.tail.next = lastNode;
          this.tail = lastNode;
        }
        this.size++;
    }
    
    public void add(int index,E e){
        if(index<=0) addFirst(e);
        else if(index>=this.size) addLast(e);
        else{
            Node<E>currentNode = this.head;
            Node<E>newNode = new Node<>(e);
            
            for (int i = 0; i < index-1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode; 
            this.size++;
        }
    }
    
    public E removeFirst(){
        if(size == 0) return null;
        E elem = this.head.element;
        this.head= this.head.next;
        
        if(this.head == null){
            this.tail = null;
        }
        
        this.size--;
        return elem;
    }
    
    public E removeLast(){
        switch (size) {
            case 0 -> {
                return null;
            }
            case 1 -> {
                E elem = this.head.element;
                this.head = this.tail = null;
                size--;
                return elem;
            }
            default -> {
                Node<E>currentNode = this.head;
                for (int i = 0; i < size-1; i++) {
                    currentNode = currentNode.next;
                }
                E elem = currentNode.next.element;
                currentNode.next = null;
                this.tail = currentNode;
                this.size--;
                return elem;
            }
          }
        }
     
        public E remove(int index){
            if(index<=0) return removeFirst();
            else if(index>=size) return removeLast();
            else{
              Node<E>currentNode = head;
              for (int i = 0; i < index-1; i++) {
                 currentNode = currentNode.next;
              }
              E elem = currentNode.next.element;
              currentNode.next = currentNode.next.next;
              this.size--;
              return elem;
            }
        }
        
        public E get(int index){
            Node<E>currentNode = this.head;
            if(index<0 || index>=this.size) return null;
            for (int i = 0; i < index ;i++) {
                currentNode = currentNode.next;
            }
            return currentNode.element;
        }
        
        public boolean contains(E e){
            return indexOf(e)>=0;
        }
        
        public int indexOf(E e){
           Node<E> currentNode = this.head;
           int index = 0;
            while (currentNode!=null) {
                if(currentNode.element == e) return index;
                currentNode = currentNode.next;
                index++;
            }
           return -1;
        }
        
        public E getFirst(){
            return this.head.element;
        }
        
        public E getLast(){
            return this.tail.element;
        }
        
        public int lastIndexOf(E e){
            Node<E>currentNode = this.head;
            int lastIndex = -1;
            int index = 0;
            while (currentNode!=null) {
                if(currentNode.element==e){
                    lastIndex = index;
                }
                currentNode = currentNode.next;
                index++;
            }
            
            return lastIndex;
        }
        
        public void clear(){
            this.head = this.tail = null;
        }
        
        public void print(){
            Node<E>currentNode = this.head;
            while (currentNode!=null) {
                System.out.print(currentNode.element + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
        
        public Node reverse(){
            Node next = null;
            Node prev = null;
            tail = head;
            Node currentNode = head;
            while (currentNode!=null) {
                next = currentNode.next;
                currentNode.next = prev;
                prev = currentNode;
                currentNode = next;
            }
            head = prev;
            return prev;
        }
        
        public void set(int index,E e){
            if(index<0 || index>=this.size)
                throw new IndexOutOfBoundsException("Invalid index : " + index);
            Node<E>currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            currentNode.element = e;
        }
        
        public E getMiddleValue(){
            return get((this.size+1)/2);
        }
}

