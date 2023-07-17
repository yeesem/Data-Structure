/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB10;

import java.util.ArrayList;
import java.util.List;
public class L10Q2 {
    public static void main(String[] args) {
        System.out.println(pemuteString("ABCD"));
    }
    
    public static List<String> pemuteString(String s){
        if(s.length()==0) return List.of("");
        char firstChar = s.charAt(0);
        List<String>permute = pemuteString(s.substring(1));
        System.out.println("Permute : " + permute);
        List<String>list = new ArrayList<>();
        for(String permutation:permute){
            for (int i = 0; i < s.length(); i++) {
                list.add(insert(permutation,firstChar,i));
                System.out.println(list);
            }
        }
        return list;
    }
    
    private static String insert(String permute,char firstChar,int index) {
        return permute.substring(0,index) + firstChar + permute.substring(index);
    }
    
    
}
