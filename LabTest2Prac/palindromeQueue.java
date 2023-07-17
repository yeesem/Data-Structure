/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

import java.util.LinkedList;
import java.util.Queue;

public class palindromeQueue {
    public static void main(String[] args) {
        boolean check = true;
        Queue<Character>queue = new LinkedList<>();
        String content = "qwerttrewq";
        for (int i = 0; i < content.length(); i++) {
            queue.offer(content.charAt(i));
        }
        
        for (int i = content.length()-1; i >=0; i--) {
            if(queue.poll()!=content.charAt(i)){
                check = false;
                break;
            }
        }
        
        System.out.println(check);
    }
}
