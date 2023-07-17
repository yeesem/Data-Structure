/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

public class ArrayBag<T> implements BagInterface<T> {
    private static int DEFAULT_CAPACITY=25;
    private T[] bag;
    private int numberOfEntries = 0;
    
    public ArrayBag(){
          this(DEFAULT_CAPACITY);
    }
    
    public ArrayBag(int size){    
          bag = (T[])new Object[size];
    }
    
    @Override
    public int getCurrentSize() {
        return this.numberOfEntries;
    }

    @Override
    public boolean isFull(){
        return numberOfEntries == this.bag.length;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T anEntry){
        if(numberOfEntries==this.bag.length)
            return false;
        bag[numberOfEntries] = anEntry;
        numberOfEntries++;
        return true;
    }

    @Override
    public int getFrequencyOf(T entry){
        int freq = 0;
        for (int i = 0; i < getCurrentSize(); i++) {
            if(this.bag[i]==entry)
                freq++;
        }
        return freq;
    }
    
    @Override
    public T remove(){
        T elem = bag[getCurrentSize()];
        bag[getCurrentSize()] = null;
        numberOfEntries--;
        return elem;        
    }

    @Override
    public void clear() {
        bag = (T[])new Object[this.bag.length];
        numberOfEntries = 0;
    }

    @Override
    public boolean remove(T anEntry) {
        for (int i = 0; i < getCurrentSize(); i++) {
            if(bag[i]==anEntry){
                numberOfEntries--;
                bag[i] = bag[getCurrentSize()];
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(T entry){
        for (int i = 0; i < this.getCurrentSize(); i++) {
            if(bag[i]==entry)
                return true;
        }
        return false;
    }

    @Override
    public T[] toArray() {
        return bag;
    }
    
    @Override
    public BagInterface<T> Union(BagInterface<T>bagInput){
        BagInterface<T>newBag = new ArrayBag<>();
        for (int i = 0; i < this.getCurrentSize(); i++) {
            newBag.add(this.bag[i]);
        }
        
        T [] bagInput2 = bagInput.toArray();
        
        for (int i = 0; i < bagInput.getCurrentSize(); i++) {
            newBag.add(bagInput2[i]);
        }
        
        return newBag;
    }
    
    @Override
    public BagInterface<T>Intersect(BagInterface<T>bagInput){
        BagInterface<T>newBag;
        if(this.getCurrentSize()<=bagInput.getCurrentSize()){
            newBag = new ArrayBag<>(this.getCurrentSize());
            for (int i = 0; i < this.getCurrentSize(); i++) {
                if(newBag.contains(bag[i])) continue;
                int min = Math.min(this.getFrequencyOf(bag[i]),bagInput.getFrequencyOf(bag[i]));
                for (int j = 0; j < min; j++) {
                    newBag.add(bag[i]);
                }
            }
        }
        else{
            newBag = new ArrayBag<>(bagInput.getCurrentSize());
            T [] tempt = bagInput.toArray();
            for (int i = 0; i < bagInput.getCurrentSize(); i++) {
                if(newBag.contains(tempt[i])) continue;
                int min = Math.min(this.getFrequencyOf(tempt[i]),bagInput.getFrequencyOf(tempt[i]));
                for (int j = 0; j < min; j++) {
                    newBag.add(tempt[i]);
                }
            }
        }
        return newBag;
    }
    
    @Override
    public BagInterface<T> Difference(BagInterface<T>bagInput){
        ArrayBag<T> newBag = new ArrayBag<>(this.getCurrentSize());

        // Copy
        for (int i = 0; i < this.getCurrentSize(); i++){newBag.add(this.bag[i]);}

        T[] bagArr = bagInput.toArray();

        for (int i = 0; i < bagInput.getCurrentSize(); i++){if (newBag.contains(bagArr[i])) newBag.remove(bagArr[i]);}

        return newBag;
    }
}
