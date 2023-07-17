/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

public class SList<E>{
    //protected SNode<E> head,tail;
    SNode<E> head;
    SNode<E> tail;
    int size = 0;
    
    public SList(){
        //head = tail = null;
        this.head = null;
        this.tail = null;
    }
    
    public void appendFirst(E e){
        SNode<E>newNode = new SNode<>(e);
        if(this.size==0) head = tail = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
    public void appendEnd(E e){
        SNode<E>newNode = new SNode<>(e);
        if(this.size==0) this.head = this.tail = newNode;
        else{
            this.tail.next = newNode;
            tail = newNode;
        }
        this.size++;
        
        /*
        SNode<E>tempt = new SNode<>(e);
        if(head==null){
           head = tail = tempt;
        }
        else{
           tail.next = tempt;
           tail = tempt;
        }
        this.size++;
        */
    }
    
    public E removeInitial(){
        if(this.size==0) return null;
        else if(this.size==1){
            E elem = head.element;
            this.head = this.tail = null;
            return elem;
        }
        E elem = head.element;
        this.head = this.head.next;
        this.size--;
        return elem;
        /*
        Method 1
        if(this.size==0) return null;
        else if(this.size==1){
          E elem = head.element;
          this.head = this.tail = null;
          this.size--;
          return elem;
        }
        E elem = this.head.element;
        head = head.next;
        this.size--;
        return elem;
        
        Method 2
        if(this.size==0) return null;
        else{
          SNode<E>tempt = head;
          this.head = head.next;
          if(head==null){
            tail = null;
          }
          this.size--;
          return tempt.element;
        }
        */
    }
    
    public boolean contains(E e){
        SNode<E>currentNode = head;
        while (currentNode!=null) {
            if(currentNode.element == e)
                return true;
            currentNode = currentNode.next;
        }
        return false;
        
        /*
        SNode<E>tempt = head;
        while(tempt!=null){
          if(tempt.element.equals(e))
             return true;
          tempt = tempt.next;
        }
        return false;
        */
    }
    
    public void clear(){
        this.head = this.tail = null;
        this.size=0;
        System.out.println("Clear done");
        /*
        this.head = this.tail = null;
        this.size = 0;
        */
    }
    
    public void display(){
        SNode<E>currentNode = this.head;
        while (currentNode!=null) {
            System.out.print(currentNode.element + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
        /*
        for(SNode<E>tempt = head;tempt!=null;tempt=tempt.next){
           System.out.print(tempt.element + " ");
        }
        System.out.println();
        */
    }
}
