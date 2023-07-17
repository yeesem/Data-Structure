/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_2;

public class Container<T> {
    private T t;
    
    public Container(){}
    
    public void add(T t){
        this.t = t;
    }
    
    public T retrive(){
        return t;   
    }
    
    public static void main(String[] args) {
        Container<Integer> conInt = new Container<>();
        Container<String> conStr = new Container<>();
        
        conInt.add(50);
        conStr.add("Hello World");
        
        System.out.println(conInt.retrive());
        System.out.println(conStr.retrive());
    }
}
