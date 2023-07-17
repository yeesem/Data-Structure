/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB7;

import java.util.LinkedList;
import java.util.Queue;
public class L7Q2 {
    public static void main(String[] args) {
        Queue<Character>queue = new LinkedList<>();
        String word = "bcacb";
        
        for(char w : word.toCharArray()){
            queue.add(w);
        }    
        
        System.out.println("Does " + word + " is palindromic : " + isPalindromic(queue,word));
    }
    
    public static boolean isPalindromic(Queue<Character>queue,String word){
        for (int i = word.length()-1; i >=0; i--) {
            if(word.charAt(i)!=queue.poll())
                return false;
        }
        return true;
        
    }
}
