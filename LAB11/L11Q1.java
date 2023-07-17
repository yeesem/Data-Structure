/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB11;

import java.util.Arrays;
import java.util.Collections;
public class L11Q1 {
    public static void main(String[] args) {
        int [] arr = {45, 7, 2, 8, 19, 3};
        selectionSortSmallest(arr);
        System.out.println(Arrays.toString(arr));
        
        Integer [] tempt = {1,2,3};
        largeToSmall(tempt);
        System.out.println(Arrays.toString(tempt));
        
        largeToSmall(arr);
        System.out.println(Arrays.toString(arr));
        
        selectionSortLargest(arr);
        System.out.println(Arrays.toString(arr));
        
        arr = new int[]{10,34,2,56,7,67,88,42};
        insertionAlgorithms(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void largeToSmall(Integer[]arr){
        //Integer[]tempt = Arrays.stream(arr).mapToObj(Integer::valueOf).toArray(Integer[]::new);
        Arrays.sort(arr,Collections.reverseOrder());
    }
    
    public static void largeToSmall(int[]arr){
        Integer[]tempt = new Integer[arr.length];
        for (int i = 0; i < arr.length;i++) {
            tempt[i] = arr[i];
        }
        Arrays.sort(tempt,Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tempt[i];
        }
    }
    
    public static void selectionSortSmallest(int[]arr){
//        Method 1
//        Arrays.sort(arr);

//        Method 2
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-1; j++) {
//                if(arr[j]>arr[j+1]){
//                    int tempt = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tempt;
//                }
//            }
//        }

//        Method 3
          for (int i = 0; i < arr.length-1; i++) {
              int minIndex = i;
              for (int j = i+1; j < arr.length; j++) {
                  if(arr[minIndex]>arr[j]) 
                      minIndex = j;
              }
              if(minIndex!=i){
                  int tempt = arr[minIndex];
                  arr[minIndex] = arr[i];
                  arr[i] = tempt;
              }
          }
    }
    
    public static void selectionSortLargest(int[]arr){
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-1; j++) {
//                if(arr[j]<arr[j+1]){
//                    int tempt = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tempt;
//                }
//            }
//        }
        for (int i = 0; i < arr.length-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[maxIndex]<arr[j])
                    maxIndex = j;
            }
            
            if(maxIndex!=i){
                int tempt = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = tempt;
            }
        }
    }
    
    public static void insertionAlgorithms(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j;
            for (j = i-1; j >= 0 && current<arr[j];j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = current;
        }
    }
    
    public static void insert(int [] arr){
        for (int i = 1;i < arr.length; i++) {
            int current = arr[i];
            int j;
            for (j = i-1; j >=0 && current<arr[j]; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = current;
        }
    }
}
