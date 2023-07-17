/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

public class postfixEvaluation {
    public static void main(String[] args) {
        System.out.println("Testing PostfixEvaluation : ");
        System.out.println("2 3 + 4 * 5 - : " + evaluatePostfix("2 3 + 4 * 5 -"));
    }
    
    public static int evaluatePostfix(String content){
        GenericStack<Integer>stack = new GenericStack<>();
        String [] chars = content.split(" ");
        for(String tempt : chars){
            if(isNumeric(tempt)){
                stack.push(Integer.valueOf(tempt));
            }else{
                int operandTwo = stack.pop();
                int operandOne = stack.pop();
                switch(tempt){
                    case "+" -> stack.push(operandOne + operandTwo);
                    case "-" -> stack.push(operandOne - operandTwo);
                    case "*" -> stack.push(operandOne * operandTwo);
                    case "/" -> stack.push(operandOne / operandTwo);
                }
            }
        }
        return stack.pop();
    }
    
    public static boolean isNumeric(String tempt){
        try{
            double test = Double.parseDouble(tempt);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
}
