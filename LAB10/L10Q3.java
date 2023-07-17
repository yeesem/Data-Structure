/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB10;

public class L10Q3 {
    public static void main(String[] args) {
        System.out.println(exponent(10,3));
    }
    
    public static long exponent(int num,int power){
        if(power==1)
            return num;
        return num * exponent(num,power-1);
    }
}
