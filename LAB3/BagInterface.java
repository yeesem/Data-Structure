/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

public interface BagInterface<T>{
    public int getCurrentSize();
    public boolean isFull();
    public boolean isEmpty();
    public boolean add(T anEntry);
    public T remove();
    public void clear();
    public boolean remove(T anEntry);
    public boolean contains(T entry);
    public int getFrequencyOf(T entry);
    public T[] toArray();
    public BagInterface<T> Union(BagInterface<T>bag);
    public BagInterface<T> Difference(BagInterface<T>bag);
    public BagInterface<T> Intersect(BagInterface<T>bag);
}
