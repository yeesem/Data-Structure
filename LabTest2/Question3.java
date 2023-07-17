/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Question3 {
    public static void main(String[] args) {
        int [] inputArr = {9, 8, 6, 4, 3, 1};
        int k = 4;
        
        Object [] tempt = slideWindow(inputArr,k);
        for (int i = 0; i < tempt.length; i++) {
            System.out.print(tempt[i] + ", ");
        }
    }
    
    public static Object[] slideWindow(int[]inputArr,int k){
        ArrayList<Integer>list = new ArrayList<>();
        PriorityQueue<Integer>queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < inputArr.length; i++) {
            queue.clear();
            if(i==(inputArr.length-k+1))
                break;
            for (int j = i; j < (i+k); j++) {
                queue.offer(inputArr[j]);
            }
            list.add(queue.peek());
        }
        return list.toArray();
    }
}
