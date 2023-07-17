/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB6;

import java.util.HashMap;

public class Extra1 {
    public static void main(String[] args) {
        solutionFirstUni s = new solutionFirstUni();
        String con = "loveleetcode";
        System.out.println(s.firstUniqChar(con));
    }
}

class solutionFirstUni{ 
//    public int firstUniqChar(String s) { 
//        for (int i = 0; i < s.length(); i++) {
//            StringBuilder tempt = new StringBuilder(s);
//            String test = tempt.deleteCharAt(i).toString();
//            if(!test.contains(Character.toString(s.charAt(i))))
//                return i;
//        }
//        return -1;
//    } 
      
      public int firstUniqChar(String s) {
          HashMap<Character,Integer>map = new HashMap<>();
          HashMap<Character,Integer>test = new HashMap<>();
          for (int i = 0; i < s.length(); i++) {
              test.put(s.charAt(i),map.getOrDefault(map.get(s.charAt(i)), 0)+1);
              if(map.containsKey(s.charAt(i)))
                map.replace( s.charAt(i),map.get(s.charAt(i))+1);
              else
                map.put(s.charAt(i),1);
          }
          
          for(char c : map.keySet()){
              System.out.println(c + " " + map.get(c));
          }
          
          for (int i = 0; i < s.length(); i++) {
              if(map.get(s.charAt(i))==1)
                  return i;
          }
          
          
          
          return -1;
      }
} 