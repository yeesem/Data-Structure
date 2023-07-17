/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2_PRACTICE;

public class findMinMax<E>{
    public static <E extends Comparable<E>> void minmax(E [] arr){
        E min = arr[0];
        E max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].compareTo(min)<0)
                min = arr[i];
            if(arr[i].compareTo(max)>0)
                max = arr[i];
        }
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String [] stringArray = {"red", "blue", "orange", "tan"};
        
        minmax(intArray);
        minmax(stringArray);
    }
}
