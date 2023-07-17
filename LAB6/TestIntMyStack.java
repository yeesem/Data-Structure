/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB6;

import java.util.Scanner;
public class TestIntMyStack {
    public static void main(String[] args) {
        MyStack<Integer>stack = new MyStack<>();
        Scanner input = new Scanner(System.in);
        int size = 0;
        
        System.out.print("Enter the size of stack : ");
        size = input.nextInt();
        
        for (int i = 1; i <= size; i++) {
            System.out.print("Number " + i + " : ");
            int num = input.nextInt();
            stack.push(num);
        }
        
        System.out.println();
        
        System.out.println("Size of stack : " + stack.getSize());
        
        int i=1;
        while (!stack.isEmpty()) {
            System.out.println(i + ". " + stack.pop());
            i++;
        }
        
        input.close();
        
        //The values are printed in reverse order because the lastmost value is printed first
    }
}
