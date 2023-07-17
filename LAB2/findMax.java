/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

public class findMax {
    public static <E extends Comparable<E>> E max(E [] list){
         E highest = list[0];
         for(E tempt : list){
             if(tempt.compareTo(highest)>0){
                 highest = tempt;
             }
         }
         return highest;
    }
    
    public static void main(String[] args) {
        Integer [] objInt = {1,2,3};
        String [] objStr = { "red", "green", "blue"};
        Circle [] objCir = {new Circle(3),new Circle(2.9),new Circle(5.9)};
        
        System.out.println(max(objInt));
        System.out.println(max(objStr));
        System.out.println(max(objCir));
        
    }
}

class Circle implements Comparable<Circle>{
    private double radius;
    
    //Constructor    
    public Circle(double radius){
        this.radius = radius;
    }    
    
    @Override
    public int compareTo(Circle obj){   
        if(this.radius>(obj).radius) return 1;
        else if(this.radius<obj.radius) return -1;
        
        return 0;
    }
    
    @Override
    public String toString(){
        return "Radius: " + radius; 
    }
}
