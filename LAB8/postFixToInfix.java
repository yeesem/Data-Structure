/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB8;

import java.util.Stack;
public class postFixToInfix {
    public static void main(String[] args) {
        Stack<String>stack = new Stack<>();
        String test = "23+4*5-";
        for (int i = 0; i < test.length(); i++) {
            if(Character.isDigit(test.charAt(i))){
                stack.push(Character.toString(test.charAt(i)));
            }
            else{
                String tempt1 = stack.pop();
                String tempt2 = stack.pop();
                stack.push("(" + tempt2 + test.charAt(i) + tempt1 + ")");
            }
        }
        System.out.println("Ans : " + stack.peek());
    }
}
