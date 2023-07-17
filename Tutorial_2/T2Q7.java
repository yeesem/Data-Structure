/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_2;

import java.util.ArrayList;
public class T2Q7 {
    public static void allTransportation(ArrayList<?>arr1,ArrayList<?>arr2){
        
    }
    
    public static void display(ArrayList<?>arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayList<Integer>numOfCars = new ArrayList<>();
        ArrayList<Double> milePerHour = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            numOfCars.add(i);
            milePerHour.add(i+0.0);
        }
        display(numOfCars);
        display(milePerHour);
    }
}
