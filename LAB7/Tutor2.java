/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB7;

import java.util.Scanner;
public class Tutor2 {
    public static void main(String[] args) {
        MyQueue<Integer> q = new MyQueue<>();
        Scanner keyIn = new Scanner(System.in);
            for (int i = 1; i <= 5; i++)
             {
             if (keyIn.nextBoolean()){
                 System.out.print(i + " ");
             }
             else
                 q.enqueue(i);
             }
            
            while (!q.isEmpty()){
                 System.out.print(q.dequeue() + " ");
            }
            System.out.println();
            keyIn.close();
    }
}
