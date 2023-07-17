/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB8;

public interface PriorityQueueInterface<E>{
    /**
     * Display all the elements inside this priority queue.
     *
     * @return the name of the company making this bid.
     */
    @Override
    public String toString();
    
    /**
     * Retrieve and remove the first element in this priority queue.
     *
     * @return and remove the first element in this priority queue.
     */
    public E poll();
    
    /**
     * add new element 5 into the priority queue
     *
     * @param e
     */
    public void add(E e);
    
    /**
     * convert the priority queue into an array and display.
     *
     * @return convert the priority queue into an array and display.
     */
    public E[] toArray();
    
    /**
     * retrieve the first element in the priority queue.
     *
     * @return the first element in the priority queue.
     */
    public E peek();
    
    /**
     * check if the priority queue consists of element “1”.
     *
     * @param e
     * @return true check if the priority queue consists of element “1”.
     */
    public boolean contains(E e);
    
    /**
     * check if the priority queue consists of element “1”.
     *
     * @return get the current size of the priority queue.
     */
    public int getSize();
    
    /**
     *  display while removing the elements in the queue until it is empty.
     *
     */
    public void isEmpty();
    
    /**
     *  Sort the priority queue in reversing order.
     *
     */
    public void sort();
    
    public int getFrequency(E e);
    
    public void display();
    
    public void Union(PriorityQueueInterface<E>queue2);
    
    public void Intersection(PriorityQueueInterface<E>queue2);
    
    //public void Difference(PriorityQueueInterface<E>queue1,PriorityQueueInterface<E>queue2);
}
