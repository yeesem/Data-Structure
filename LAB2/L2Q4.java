/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

public class L2Q4 {
    public static <T extends Comparable<T>> String minmax(T [] arr){
        T max = arr[0];
        T min = arr[0];
        for(T tempt : arr){
           if(tempt.compareTo(max) > 0)
               max = tempt;
           else if(tempt.compareTo(min) < 0)
               min = tempt;
        }
        
        return "Max : " + max + " Min : " + min;
    }
    
    public static void main(String[] args) {
        String [] test = {"red", "blue", "orange", "tan"};
        Integer [] test2 = {5,3,7,1,4,9,8,2};
        
        //Must use Integer, int is not acceptable
        System.out.println(minmax(test2));
        System.out.println(minmax(test));
    }
}
