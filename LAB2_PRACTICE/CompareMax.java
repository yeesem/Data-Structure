/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2_PRACTICE;

public class CompareMax<E>{
    public static <E extends Comparable<E>> E maximum(E x,E y,E z){
        if(x.compareTo(y)>=0){
            if(x.compareTo(z)>=0)
                return x;
        }
        else if(y.compareTo(z)>=0)
            return y;
        
        return z;
    }
    
    public static void main(String[] args) {
        double x = 8;
        double y = 5;
        double z = 9;
        
        System.out.println("Maximum : " + maximum(x,y,z));
    }
}
