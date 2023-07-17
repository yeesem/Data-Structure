/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB6;

public class TowerOfHanoi {
    public static void main(String[] args) {
        MyStack<Integer>rod1 = new MyStack<>();
        MyStack<Integer>rod2 = new MyStack<>();
        MyStack<Integer>rod3 = new MyStack<>();
        
        int [] tower = {10,9,8,7,6,5,4,3,2,1};
        
        for(int i:tower){
            rod1.push(i);
        }
        
        System.out.println("Initial");
        System.out.println("Rod 1 : " + rod1.toString());
        System.out.println("Rod 2 : " + rod2.toString());
        System.out.println("Rod 3 : " + rod3.toString());
        
        towerOfHanoi(rod1.getSize(),rod1,rod2,rod3);
        
        System.out.println("\nFinal");
        System.out.println("Rod 1 : " + rod1.toString());
        System.out.println("Rod 2 : " + rod2.toString());
        System.out.println("Rod 3 : " + rod3.toString());
    }
    
    public static void towerOfHanoi(int n,MyStack<Integer>source,MyStack<Integer>target,MyStack<Integer>helper){
        //Base class
        if(n==1){
            target.push(source.pop());
            return;
        }
        
        towerOfHanoi(n-1,source,helper,target);        
        target.push(source.pop());
        towerOfHanoi(n-1,helper,target,source);
    }
}
