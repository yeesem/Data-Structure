/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

public class findMax_revision {
    public static <T extends Comparable<T>> T max(T [] array){
        T highest = array[0];
        for(T tempt : array){
            if(tempt.compareTo(highest)>0)
                highest = tempt;
        }
        return highest;
    }
    
    public static void main(String[] args) {
        Integer [] arrInt = {1,2,3};
        String [] arrStr = {"Red","Green","Blue"};
        Circle2 [] arrCir = {new Circle2(3),new Circle2(2.9),new Circle2(5.9)};
    
        System.out.println(max(arrInt));
        System.out.println(max(arrStr));
        System.out.println(max(arrCir));
    }
}

class Circle2 implements Comparable<Circle2>{
    
    private double radius;
    
    public Circle2(double radius){
        this.radius = radius;
    }
    
    @Override
    public int compareTo(Circle2 obj){
        if(this.radius>obj.radius)
            return 1;
        else if(this.radius<obj.radius)
            return -1;
        return 0;
    }
    
    @Override
    public String toString(){
        return "Radius " + radius;
    }
}
