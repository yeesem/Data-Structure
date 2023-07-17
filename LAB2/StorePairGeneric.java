/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

public class StorePairGeneric <E extends Comparable<E>> implements Comparable<StorePairGeneric<E>>{
    private E first;
    private E second;
    
    public StorePairGeneric(E first,E second){
        this.first = first;
        this.second = second;
    }
    
    public E getFirst(){
        return first;
    }
    
    public E getSecond(){
        return second;
    }
    
    public void setPair(E first,E second){
        this.first = first;
        this.second = second;
    }
    
    @Override
    public String toString(){
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object obj) { 
//         if(obj==this) return true;
//         if(!(obj instanceof StorePairGeneric)) return false;
//         
//         return this.first.equals(((StorePairGeneric<E>) obj).getFirst());
       
          //StorePairGeneric<E>other = (StorePairGeneric<E>) obj;
          //return this.first.equals(other.getFirst());
            return this.first.equals(((StorePairGeneric<E>)obj).getFirst());
    }
    
    @Override
    public int compareTo(StorePairGeneric<E> e){
        return this.first.compareTo(e.getFirst());
    }
    
//    @Override
//    public int compareTo(StorePairGeneric<E> e){
//        return this.first.compareTo(e.getFirst());
//    }
    
}

class L2Q3{
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6,3);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equals(c));
        
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));
        System.out.println(a.compareTo(c));
        
  }
}
