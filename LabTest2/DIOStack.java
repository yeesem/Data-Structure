/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2;

import java.util.ArrayList;

public class DIOStack<DIO>{
    private DIO[] array = (DIO[]) new Object[1];
    private int size = 0;
    ArrayList<DIO>list = new ArrayList<>();
    public void push(DIO o){
        
//        System.out.println(array.length + " " + size);
//        size++;
//        array = (DIO[]) new Object[size];
//        System.out.println(array.length);

//        list.add(o);
//        resize(list.size());
//        array = (DIO[]) list.toArray();

        array[size]=o;
        size++;
        DIO [] tempt = (DIO[]) new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            tempt[i] = array[i];
        }
        resize(size);
        for (int i = 0; i < tempt.length; i++) {
            array[i] = tempt[i];
        }
    }
    
    public DIO pop(){
        if(isEmpty())
            return null;
        DIO tempt = array[array.length-1];
        array[array.length-1]=null;
        size--;
        return tempt;
    }
    
    public DIO peek(){
        if(isEmpty())
            return null;
        return array[array.length-1];
    }
    
    public boolean isEmpty(){
       return array.length==0;   
    }
    
    public int size(){
        return size+1;
    }
    
    @Override
    public String toString(){
        String tempt="[";
        for (int i = 0; i <array.length; i++) {
            tempt+= array[i];
            if(i!=size)
                tempt+=",";
        }
        tempt+="]";
        return tempt;
    }
    
    private void resize(int size){
        array = (DIO[])new Object[size];
    }
}

