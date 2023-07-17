/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_1;

public class T1Q4 {
    public static void main(String[] args){
        Vehicle car = new Car(50);
        car.setCurrentSpeed(20);
        car.pedalToMedal();
    }
}

abstract class Vehicle{
    double maxSpeed;
    protected double currentSpeed;
    
    public Vehicle(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    
    public abstract void accelerate();
    
    public void setCurrentSpeed(double currentSpeed){this.currentSpeed = currentSpeed;}
    public double getMaxSpeed(){return maxSpeed;}
    public double getCurrentSpeed(){return currentSpeed;}
    
    public void pedalToMedal(){
        while (getCurrentSpeed() < getMaxSpeed()) {
            this.accelerate();
        }
    }
}

class Car extends Vehicle{
    public Car(double maxSpeed){
        super(maxSpeed);
    }
    
    public void accelerate(){
        super.currentSpeed++;
    }
}