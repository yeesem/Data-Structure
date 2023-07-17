/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB10;

public class L10Q1 {
    public static void main(String[] args) {
        System.out.println(replace(new StringBuilder("flabbergasted"),0));
        System.out.println(replace(new StringBuilder("Astronaut"),0));
        System.out.println(subsitute("flabbergasted"));
        System.out.println(subsitute("Astronaut"));
    }
    
    public static String replace(StringBuilder word,int i){
        if(word.length() == i)
             return word.toString();
        if(word.charAt(i)=='a')
            word.setCharAt(i,'i');
        return replace(word,i+1);
    }
    
    public static String subsitute(String s){
        if(s.isEmpty())
            return "";
        return (s.charAt(0)=='a'?'i':s.charAt(0)) + subsitute(s.substring(1));
    }
}
