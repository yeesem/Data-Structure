/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB10;

public class decimalToBinary {
    public static void main(String[] args) {
        int decimal = 20;
        convert(decimal,"");
    }
    
    public static void convert(int decimal,String ans){
        if(decimal==0){System.out.println(ans);return;}
        ans = Integer.toString(decimal%2) + ans;
        convert(decimal/2,ans);
    }
}
