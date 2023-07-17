/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB10;

import java.util.ArrayList;
import java.util.List;
public class permutation {
    public static void main(String[] args) {
       int [] num = {1,2,3};
       System.out.println(permute(num));
    }
    
    public static List<List<Integer>> permute(int [] num){
        List<List<Integer>>ans = new ArrayList<>();
        findPermute(ans,new ArrayList<>(),num,new boolean[num.length]);
        return ans;
    }
    
    private static void findPermute(List<List<Integer>>ans,List<Integer>list,int [] num,boolean [] used) {
        if(list.size()==num.length){
            ans.add(new ArrayList(list));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if(used[i]) continue;
            used[i]=true;
            list.add(num[i]);
            findPermute(ans,list,num,used);
            used[i]=false;
            list.remove(list.size()-1);
        }
        
    }
}
