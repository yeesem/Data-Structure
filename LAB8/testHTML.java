/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB8;

import java.util.Stack;
public class testHTML {
    
    public static boolean isHTML(String html){
        Stack<String>stack = new Stack<>();
        int j = html.indexOf('<');
        while (j!=-1) {
            int k = html.indexOf('>',j+1);
            if(k==-1)
                return false;
            String tag = html.substring(j+1,k);
            if(!tag.startsWith("/")){
                stack.push(tag);
            }
            else{
                if(tag.isEmpty())
                    return false;
                if(!tag.substring(1).equals(stack.pop()))
                    return false;
            }
            j = html.indexOf("<",k+1);
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String test = "<html><//html>";
        System.out.println(isHTML(test));
    }
}
