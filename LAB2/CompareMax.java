/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

public class CompareMax {
    public static <T extends Comparable<T>> T maximum(T a,T b,T c){
        T result = a;
        
        if(b.compareTo(result)>0) result = b;
        if(c.compareTo(result)>0) result = c;
        
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(maximum("a","b","c"));       
    }
}


