/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB10;

public class noteExp {
    public static void main(String[] args) {
        recursion(735);
    }
    
    public static void recursion(int n){
        if(n>0){
         System.out.println(n%10);
         recursion(n/10);
        }
    }
}
