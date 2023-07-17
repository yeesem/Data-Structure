/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_2;

public class Duo <A,B>{
    private A first;
    private B second;
    
    public Duo(A first,B second){
        this.first = first;
        this.second = second;
        
        System.out.println(first);
        System.out.println(second);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Duo <Integer,String> duo = new Duo(1,"Hello");
    
        Duo<String,Integer> slideShare = new Duo<>("String",1);
        Duo<Double,Double> point = new Duo<>(0.0,0.0);
    }
}
