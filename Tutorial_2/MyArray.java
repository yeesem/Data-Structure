/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_2;

public class MyArray<T>{
    
    public static <T> void listAll(T [] list){
        for (T tempt : list) {
            System.out.println(tempt);
        }
        System.out.println();
    } 
    
    public static void main(String[] args) {
        Integer [] num = {1,2,3,4,5};
        String [] names = {"Jane","Tom","Bob"};
        Character [] alphabet = {'a','b','c'};
        
        MyArray.<Integer>listAll(num);
        MyArray.<String>listAll(names);
        MyArray.<Character>listAll(alphabet);
    }
}
