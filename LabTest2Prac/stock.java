/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class stock{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenericQueue<Integer>share = new GenericQueue<>();
        GenericQueue<Integer>price = new GenericQueue<>();
        String instruction = null;
        int pln = 0;
        int numShareSell=0;
        int sellPrice = 0;
        do{
            System.out.print("Buy or Sell : ");
            instruction = input.nextLine();
            String [] array = instruction.split(" ");
            String order = array[0].toLowerCase();
            if(order.equals("buy")){
                share.enqueue(Integer.valueOf(array[1]));
                price.enqueue(Integer.valueOf(array[3]));
                System.out.println("Queue of Share : " + share);
                System.out.println("Queue of Price : " + price);
            }else if(array[0].equals("sell")){
                numShareSell = convert(array[1]);
                sellPrice = convert(array[3]);
                if(numShareSell<share.peek()){
                    share.list.set(0,share.peek()-numShareSell);
                    pln += (numShareSell*sellPrice) - numShareSell*price.peek();
                }else if(numShareSell==share.peek()){
                    pln+= (numShareSell*sellPrice) - (numShareSell*price.peek());
                    share.dequeue();
                    price.dequeue();
                }else if(numShareSell>share.peek()){
                    while ((!share.isEmpty()) && numShareSell>=share.peek()) {
                        numShareSell-=share.peek();
                        pln += (share.peek()*sellPrice) - (share.peek() * price.peek());
                        share.dequeue();
                        price.dequeue();
                    }
                    if((!share.isEmpty()) && numShareSell!=0){
                        share.list.set(0, share.peek()-numShareSell);
                        pln += (numShareSell*sellPrice) - numShareSell * price.peek();
                    }
                }
                System.out.println("Queue of Share : " + share);
                System.out.println("Queue of Price : " + price);
                System.out.println("Total Capital Gain / Loss : " + pln);
            }
        }while(!share.isEmpty());
        System.out.println("\nFinal Capital Gain / Loss : " + pln);
        
    }
    
    public static int convert(String tempt){
        return Integer.parseInt(tempt);
    }
}
