/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2_PRACTICE;

public class MInMax2Array<E>{
    public static <E extends Comparable<E>> void min(E [][] arr){
        E min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j].compareTo(min)<0)
                    min = arr[i][j];
            }
        }
        System.out.println("Minimum : " + min);
    }
    
    public static <E extends Comparable<E>> void max(E [][] arr){
        E max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j].compareTo(max)>0)
                    max = arr[i][j];
            }
        }
        System.out.println("Maximum : " + max);
    }
    public static void main(String[] args) {
        Integer [][] num = { {4, 5, 6}, {1, 2, 3}};
        max(num);
        min(num);
    }
}
