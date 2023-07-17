/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB7;

import java.util.Stack;
public class PostfixEvaluation {
    public static void main(String[] args) {
        System.out.println("Testing evaluation : ");
        System.out.println("2 3 + 4 * 5 - : " + 
                evaluatePostfix("2 3 + 4 * 5 -"));
    }
    
    public static double evaluatePostfix(String equation){
        Stack<Double>stack = new Stack<>();
        String[]tempt = equation.split(" ");
        for (int i = 0; i < tempt.length; i++) {
            if(isDigit(tempt[i])){
                stack.push(Double.valueOf(tempt[i]));
            }
            else{
                stack.push(compute(stack.pop(),stack.pop(),tempt[i]));
            }
        }
        return stack.peek();
    }
    
    public static double compute(double num2,double num1,String sign){
          double ans=0;
          switch(sign){
             case "+" -> ans =  (num1) + (num2);
             case "-" -> ans =  (num1) - (num2);
             case "*" -> ans =  (num1) * (num2);
             case "/" -> ans =  (num1) / (num2);
         }
         return ans;
    }
    
    public static boolean isDigit(String tempt){
        try {
            double d = Double.parseDouble(tempt);
        } 
        catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
