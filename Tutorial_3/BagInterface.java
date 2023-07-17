/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_3;

public interface BagInterface<T>{
    public int getCurrentSize();
    public boolean isEmpty();
    public T remove();
    public boolean isFull();
    public boolean remove(T item);
    public boolean add(T item);
    public boolean contains(T item);
    public void clear();
    public int getFrequencyOf(T item);
    public T[]toArray();
    public T get(int i);
}
