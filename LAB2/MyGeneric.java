/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;


public class MyGeneric <E>{
    private E e;
    
    public MyGeneric(){
        //No Arguement Constructor
    }
    
    public MyGeneric(E e){
        this.e = e;
    }
    
    public void setGeneric(E e){
        this.e = e;
    }
    
    public E getGeneric(){
        return e;
    }
    
    public static void main(String[] args) {
        MyGeneric<Integer> intObj = new MyGeneric(1);
        MyGeneric<Integer> intObj2 = new MyGeneric();
        MyGeneric<String> strObj = new MyGeneric("Hello World");
        
        intObj2.setGeneric(2);
        
        System.out.println("Integer : " + intObj.getGeneric());
        System.out.println("Integer : " + intObj2.getGeneric());
        System.out.println("String  : " + strObj.getGeneric());
    }
}


