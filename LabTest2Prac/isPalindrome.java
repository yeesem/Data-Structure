/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

import java.util.Stack;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(check());
    }
    
    public static boolean check(){
        Stack<Character>stack = new Stack<>();
        String word = "a";
        if(word.length()%2==0){
            for (int i = 0; i < word.length()/2; i++) {
                stack.push(word.charAt(i));
            }
            for (int i = word.length(); i>word.length(); i--) {
                if(stack.pop()!=word.charAt(i))
                    return false;
            }
        }else{
            for (int i = 0; i < word.length(); i++) {
                if(i < word.length()/2)
                    stack.push(word.charAt(i));
                else if(i>word.length()/2){
                    if(stack.pop()!=word.charAt(i))
                        return false;
                }
            }
        }
        return true;
    }
}
