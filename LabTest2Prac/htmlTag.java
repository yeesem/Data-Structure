/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

import java.util.Stack;
public class htmlTag {
    public static void main(String[] args) {
        String html = "<body><center><h1> The Little Boat </h1></center></body>";
        System.out.println(checkHTML(html));
        
    }
    
    public static boolean checkHTML(String html){
        Stack<String>stack = new Stack<>();
        int j = html.indexOf("<");
        if(j==-1)
            return false;
        while (j!=-1){
           int k = html.indexOf(">",j+1);
           if(k==-1)
             return false;
           String tempt = html.substring(j+1,k);
           //It is closing tag
           if(tempt.charAt(0)!='/'){
               stack.push(tempt);
           }else{
               if(!stack.pop().equals(tempt.substring(1)))
                   return false;
           }
           j = html.indexOf("<",k+1);
        }
        return stack.isEmpty();
    }
}
