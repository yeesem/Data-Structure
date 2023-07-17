/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2_PRACTICE;

class StorePairGeneric<E extends Comparable<E>> implements Comparable<StorePairGeneric<E>>{
    private E first;
    private E second;
    
    public StorePairGeneric(E first,E second){
        this.first = first;
        this.second = second;
    }
    
    public E getFirst(){
        return this.first;
    }
    
    public E getSecond(){
        return this.second;
    }
    
    public void setPair(E first,E second){
        this.first = first;
        this.second = second;
    }
    
    @Override
    public String toString(){
        return "First : " + first + ", Second : " + second;
    }
    
    @Override
    public boolean equals(Object a){
        return this.getFirst().equals(((StorePairGeneric<E>)a).getFirst());
    }
    
    @Override
    public int compareTo(StorePairGeneric<E>e){
        return this.first.compareTo(e.getFirst());
    }
    
    public static void main(String[] args) {
        StorePairGeneric<Integer>a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer>b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer>c = new StorePairGeneric<>(6,3);
        
        System.out.println(a.compareTo(b));
        System.out.println(a.equals(c));
    }
}
