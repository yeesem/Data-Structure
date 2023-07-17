/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB10;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        String word;
        Scanner input = new Scanner(System.in);
        word = input.next();
        System.out.println(reverse(word));
    }
    
    public static String reverse(String word){
        if(word.length()==1 || word.equals(""))
            return word;
        else{
            System.out.println(word.charAt(word.length()-1));
            word = word.substring(0,word.length()-1);
            return reverse(word);
        }
    }
}
