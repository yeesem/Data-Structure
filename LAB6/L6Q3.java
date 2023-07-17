/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB6;

public class L6Q3<E> {
  public int sum(MyStack<Integer>s){
      int total = 0;
      while (!s.isEmpty()) {
          total += s.pop();
      }
      return total;
  }    
}
