/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB6;

public class L6Q4 {
    
    public static boolean isPalindromic(String line){
        MyStack<Character>stack= new MyStack<>();
//        for (int i = 0; i < (line.length()+1)/2; i++) {
//            stack.push(line.charAt(i));
//        }
//        for (int i = line.length()/2; i < line.length(); i++) {
//            char tempt = stack.pop();
//            System.out.println("Char : " + line.charAt(i));
//            System.out.println("Tempt : " + tempt);
//            if(line.charAt(i)!=tempt)
//                return false;
//        }
        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i));
            stack.push(line.charAt(i));        
        }
        System.out.println();
        
        for (int i = 0; i < line.length()/2 + 1; i++) {
            char tempt = stack.pop();
            if(line.charAt(i)!=tempt)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindromic("kayaka"));
    }
}
