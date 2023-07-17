/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

public class MinMax2DArray_Revision {
    
    public static <T extends Comparable<T>> T max(T [][] array){
        T highest = array[0][0];
        for(T [] tempt : array){
            for(T tempt2 : tempt){
                if(tempt2.compareTo(highest)>0)
                    highest = tempt2;
            }
        }
        return highest;
    }
    
    public static <T extends Comparable<T>> T min(T [][] array){
        T lowest = array[0][0];
        for(T [] tempt : array){
            for (T tempt2 : tempt){
                if(tempt2.compareTo(lowest)<0){
                    lowest = tempt2;
                }
            }
        }
        return lowest;
    }
    
    public static void main(String[] args) {
        Integer[][]exp = {{4, 5, 6}, {1, 2, 3}};
        System.out.println(max(exp));
        System.out.println(min(exp));
    }
}
