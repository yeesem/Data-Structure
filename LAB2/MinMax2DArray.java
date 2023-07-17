/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

public class MinMax2DArray {
    public static <E extends Comparable<E>> E min(E[][]list){
        E resultMin = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if(resultMin.compareTo(list[i][j])>0)
                    resultMin = list[i][j];
            }
        }
        
        return resultMin;
    }
    
    public static <E extends Comparable<E>> E max(E [][] list){
        E resultMax = list[0][0];
        for(E [] tempt : list){
            for(E tempt2 : tempt){
                if(resultMax.compareTo(tempt2)<0)
                    resultMax = tempt2;
            }
        }
        return resultMax;
    }
    
    public static void main(String[] args) {
        Integer [][] num = {{4, 5, 6}, {1, 2, 3}};
        System.out.println("Max: " + max(num));
        System.out.println("Min: " + min(num));
    }
}
