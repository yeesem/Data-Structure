/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB7;

import java.util.Scanner;

public class L7Q3 extends MyQueue<Integer>{
    
    public void updateQuery(int numShare){
        int tempt = super.peek() - numShare;
        if(tempt>0)
             super.list.set(0,tempt);
        else if(tempt==0){
            list.removeFirst();
        }
        else if(tempt<0){
            list.removeFirst();
            list.set(0,super.peek()+tempt);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        L7Q3 share = new L7Q3();
        L7Q3 price = new L7Q3();
        
        int res= 0;
        String query;
        
        do{
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each') : ");
            query = input.nextLine();
            
            String [] tempt = query.split(" ");
            
            if(tempt[0].equalsIgnoreCase("Buy")){
                share.enqueue(Integer.valueOf(tempt[1]));
                price.enqueue(Integer.valueOf(tempt[4]));
                System.out.println("Buying now...");
                
            }else if(tempt[0].equalsIgnoreCase("Sell")){
                if(share.isEmpty()){
                    System.out.println("No Share to Sell");
                    break;
                }
                else{
                    int shareSell = Integer.parseInt(tempt[1]);
                    int priceSell = Integer.parseInt(tempt[4]);
                    if(shareSell == share.peek()){
                        res += (shareSell*priceSell) - (shareSell*price.peek());
                        price.dequeue();
                        share.dequeue();
                    }
                    else if(shareSell<share.peek()){
                        share.updateQuery(shareSell);
                        res += (shareSell*priceSell) - (shareSell*price.peek());
                    }
                    else if(shareSell > share.peek()){
                        res += (share.peek()*priceSell) - (share.peek()*price.peek());
                        int remainShare = shareSell - share.peek();
                        share.dequeue();
                        price.dequeue();
                            if(share.isEmpty()) break;
                            else if(remainShare<share.peek()){
                                res += (remainShare*priceSell)-(remainShare*price.peek());
                                share.updateQuery(remainShare);
                            }else{
                                while (remainShare>share.peek()) {
                                    remainShare -= share.peek();
                                    res += (share.peek()*priceSell) - (share.peek()*price.peek());
                                    share.dequeue();
                                    price.dequeue();
                                }
                            }
                    }
                    System.out.println("Selling the shares now...");
                    System.out.println("Total Capital gain / Loss: " + res);
                }    
            }
            
            System.out.println("Queue for share: Queue: " + share.toString());
            System.out.println("Queue for price: Queue: " + price.toString());
        }
        while (share.getSize()!=0);
        
        System.out.println("\nFinal capital Gain / Loss: " + res);
    }
}
