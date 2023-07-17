/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2_PRACTICE;

public class MyGeneric<E>{
    E val;
    public MyGeneric(E e){
        this.val = e;
    }
    
    public MyGeneric(){}
    
    public void setVal(E e){
        this.val = e;
    }
    
    public E getVal(){
        return val;
    }
    
    public static void main(String[] args) {
        MyGeneric<String>testString = new MyGeneric<>("Hello");
        MyGeneric<String>testString2 = new MyGeneric<>();
        MyGeneric<Integer>testInt = new MyGeneric<>(1);
        MyGeneric<Integer>testInt2 = new MyGeneric<>();
        
        testString2.setVal("World");
        testInt2.setVal(2);
        
        System.out.println(testString.getVal());
        System.out.println(testString2.getVal());
        System.out.println(testInt.getVal());
        System.out.println(testInt2.getVal());
    }
}
