/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2_PRACTICE;

public class findMax {
    public static <E extends Comparable<E>> E max(E [] arr){
        E max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].compareTo(max)>0){
                max = arr[i];
            }  
        }
        return max;
    }
    
    public static void main(String[] args) {
        Integer[]arr = {1,2,3};
        System.out.println("Maximum : " + max(arr));
        
        Circle [] cir = {new Circle(1),new Circle(2),new Circle(3)};
        System.out.println("Maximum radius : " + max(cir));
    }
}

class Circle implements Comparable<Circle>{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public int compareTo(Circle obj){
        if(this.radius>obj.radius)
            return 1;
        else if(this.radius<obj.radius)
            return -1;
        return 0;
    }
    
    @Override
    public String toString(){
        return "Radius : " + radius;
    }
}
