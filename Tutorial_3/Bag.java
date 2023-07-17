/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_3;

public class Bag<T> implements BagInterface<T> {
    private static final int DEFAULT_CAPACITY = 25;
    private T [] items;
    private int numberOfItems = 0;
    
    public Bag(){
        this(DEFAULT_CAPACITY);
    }
    
    public Bag(int size){
        //IMPORTANCE NEED TO MEMORIZE THE SYNTAX
        items = (T[])new Object[size];
    }
    
    @Override
    public int getCurrentSize() {
        return numberOfItems;
    }

    @Override
    public boolean isFull(){
        return this.getCurrentSize() == this.items.length;
    }
    
    @Override
    public boolean isEmpty() {
        return numberOfItems==0;
    }

    @Override
    public boolean add(T newEntry) {
        if(getCurrentSize()==this.items.length)
            return false;
        items[numberOfItems] = newEntry;
        numberOfItems++;
        return true;
    }
    
    @Override
    public T remove(){
        
        if(this.isEmpty()){
           throw new IllegalStateException("Bag is empty");            
        }
        
        numberOfItems--;
        T elem = this.items[numberOfItems];
        items[numberOfItems] = null;
        return elem;
    }
    
    @Override
    public boolean remove(T removeItem){
        for (int i = 0; i < getCurrentSize(); i++) {
            if(items[i].equals(removeItem)){
                this.numberOfItems--;
                this.items[i] = items[getCurrentSize()];
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void clear() {
        this.items = (T[])new Object[this.items.length];
        numberOfItems = 0;
    }

    @Override
    public int getFrequencyOf(T anEntry){
        int freq = 0;
        for (int i = 0; i < getCurrentSize(); i++) {
            if(items[i].equals(anEntry))
                freq++;
        }
        return freq;
    }

    @Override
    public boolean contains(T anEntry) {
        for (int i = 0; i < getCurrentSize(); i++) {
            if(this.items[i].equals(anEntry)){
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        return this.items;
    }
    
    public BagInterface<T> Union(BagInterface<T> bag){
        Bag<T> newBag = new Bag<>(this.items.length+bag.toArray().length);
        for (int i = 0; i < this.getCurrentSize(); i++) {
            newBag.add(items[i]);
        }
        
        T [] tempt = bag.toArray();
        
        for (int i = 0; i < bag.getCurrentSize(); i++) {
            newBag.add(tempt[i]);
        }
        return newBag;
    }
    
    public BagInterface<T> different(BagInterface<T>bag){
        Bag <T> newBag = new Bag<>(this.getCurrentSize());
        for (int i = 0; i < this.getCurrentSize(); i++) {
            newBag.add(this.items[i]);
        }
        
        T [] newArr = bag.toArray();
        
        for (int i = 0; i < bag.getCurrentSize(); i++) {
            if(newBag.contains(newArr[i])){
                newBag.remove(newArr[i]);
            }
        }
        return newBag;
    }
    
    @Override
    public T get(int i){
        return items[i];
    }
}
