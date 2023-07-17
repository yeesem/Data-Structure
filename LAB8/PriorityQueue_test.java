/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class PriorityQueue_test<E extends Comparable<E>> implements PriorityQueueInterface<E>{
    
    int size = 0;
    E [] arr;
    
    public PriorityQueue_test(){}
    
    public PriorityQueue_test(E [] arr){
        Arrays.sort(arr,Collections.reverseOrder());
        this.arr = arr;
        this.size = arr.length;
    }
    
    public PriorityQueue_test(PriorityQueueInterface<E> pq) {
        ArrayList<E> list = new ArrayList<>();
        while (pq.getSize() > 0) list.add(pq.poll());
        arr = (E[]) new Object[pq.getSize()];
        for (int i = 0; i < pq.getSize(); i++) {
           arr[i] = list.get(i);
           pq.add(list.get(i));
        }        
    }
    
    @Override
    public E poll() {
        if(this.size==0) return null;
        E elem = arr[size-1];
        arr[size-1] = null;
        this.size--;        
        return elem;
    }

    @Override
    public void add(E e) {
        arr[size] = e;
        Arrays.sort(arr,Collections.reverseOrder());
        this.size++;
    }

    @Override
    public E[] toArray() {
        return this.arr;
    }

    @Override
    public E peek() {
        return arr[size-1];
    }

    @Override
    public boolean contains(E e) {
//        E [] tempt = arr;
//        Arrays.sort(tempt);
//        int high = size - 1;
//        int low = 0;
//        while (low<=high) {
//            int mid = (low + high)/2;
//            if(tempt[mid].compareTo(e)==0)
//                return true;
//            else if(tempt[mid].compareTo(e)>0)
//                high = mid - 1;
//            else if(tempt[mid].compareTo(e)<0)
//                low = mid + 1;
//        }
        for (int i = 0; i < size; i++) {
            if(arr[i].compareTo(e)==0)
               return true;
        }
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }
    
    @Override
    public int getFrequency(E e){
        int freq = 0;
        for (int i = 0; i < this.size; i++) {
            if(arr[i].equals(e)){
                freq++;
            }
        }
        return freq;
    }
    
    @Override
    public void isEmpty() {
        System.out.print("isEmpty : ");
        for (int i = size-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arr = null;
        this.size=0;
    }

    @Override
    public void sort(){
        Collections.reverse(Arrays.asList(arr));
    }
    
    @Override
    public String toString(){
        return Arrays.toString(arr);
    }
    
    @Override
    public void display(){
        System.out.print("Display : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    @Override
    public void Union(PriorityQueueInterface<E>queue){
        Object [] tempt = new Object[this.size + queue.getSize()];
        for (int i = 0; i < this.size; i++) {
            tempt[i] = arr[i];
        }
        PriorityQueue_test<E> queue2 = new PriorityQueue_test<E>((PriorityQueue_test<E>)queue);
        for (int i = this.size; i < tempt.length; i++) {
            tempt[i] = queue2.poll();
        }
        Arrays.sort(tempt,Collections.reverseOrder());
        System.out.print("Union : ");
        for (int i = 0; i < tempt.length; i++) {
            System.out.print(tempt[i] + ", ");
        }
        System.out.println();
    }
    
    @Override
    public void Intersection(PriorityQueueInterface<E>Queue){
//        System.out.println("Queue: " + Queue.getSize());
        
        System.out.print("Intersection : ");
        ArrayList<E>tempt = new ArrayList<>();
        for (int i = 0; i < this.size; i++) {
            if(!tempt.contains(arr[i])){
//                System.out.println(arr[i] + " " + this.getFrequency(arr[i]) + " " + Queue.getFrequency(arr[i]));
                    int min = Math.min(this.getFrequency(arr[i]),Queue.getFrequency(arr[i]));
                    for (int j = 0; j < min; j++) {
                        tempt.add(arr[i]);
                        System.out.print( arr[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
