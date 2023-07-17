/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

import java.util.Stack;
public class postfixToInfix {
    public static void main(String[] args) {
        Stack<String>stack = new Stack<>();
        Stack<String>stack2 = new Stack<>();
        
        String equation = "3 5 + 5 7 * /";
        String equation2 = "- + * 2 3 * 5 4 9";
        String [] tempt = equation.split(" ");
        String [] tempt2 = equation2.split(" ");
        for (int i = 0; i < tempt.length; i++) {
            if(isNumeric(tempt[i])){
                stack.push(tempt[i]);
            }else{
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                stack.push("(" + operand1 + tempt[i] + operand2 + ")");
            }
        }
        System.out.println(stack.peek());
        
        System.out.println();
        
        for (int i = tempt2.length-1; i >= 0; i--) {
            if(isNumeric(tempt2[i]))
                stack2.push(tempt2[i]);
            else{
                String op1 = stack2.pop();
                String op2 = stack2.pop();
                stack2.push("(" + op1 + tempt2[i] + op2 + ")");
            }
        }
        System.out.println(stack2.peek());
    }
    
    public static boolean isNumeric(String alpha){
        try {
          double tempt = Double.parseDouble(alpha);
        } catch (NumberFormatException e) {
           return false;
        }
        return true;
    }
}
