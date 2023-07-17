/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB8;

import java.util.Collections;
import java.util.PriorityQueue;


public class extraQues {
    public static void main(String[] args) {
        solution s = new solution();
        int [] score = {5,4,3,6,2,1};
        s.findRelativeRanks(score);
    }
}

class solution{
   public String[] findRelativeRanks(int[] score){ 
       String [] ans = new String[score.length];
       PriorityQueue<Integer>queue = new PriorityQueue(Collections.reverseOrder());
       for (int i = 0; i < score.length; i++) {
           queue.offer(score[i]);
       }
       for (int i = 0; i < score.length; i++) {
           System.out.println(queue.poll());
       }
       return ans;
   } 
}
