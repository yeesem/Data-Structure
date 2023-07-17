/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB10;

public class summation {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    
    public static int sum(int num){
        if(num==0)
          return 0;
        else
          return num + sum(num-1);
    }
}
