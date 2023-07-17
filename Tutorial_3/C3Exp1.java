/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_3;

public class C3Exp1 {
    public static void main(String[] args) {
        Item [] items = {new Item("Bird Feeder",2050),
                         new Item("Squirrel guard",1547),
                         new Item("Bird bath",4499),
                         new Item("Sunflower seed",1295)}; 
    
        BagInterface<Item>shoppingCart = new Bag<>();
        int totalCost = 0;
        for (int i = 0; i < items.length; i++) {
            Item nextItem = items[i];
            shoppingCart.add(nextItem);
            totalCost += nextItem.getPrice();
        }
        
        for(int i=0;i<shoppingCart.getCurrentSize();i++){
            System.out.println(shoppingCart.get(i).getItem() + " : $" + (double)shoppingCart.get(i).getPrice()/100);
        }
        
        System.out.println();
        
        while (!shoppingCart.isEmpty()) {
            Item tempt = shoppingCart.remove();
            System.out.println(tempt.getItem() + " : $" + (double)tempt.getPrice()/100);
        }
        
        System.out.println("Total Cost: $" + totalCost/100 + "." + totalCost%100);
    }
}

class Item<T,E>{
    private T item;
    private E price;
    
    public Item(T i,E p){
        this.item = i;
        this.price = p;
    }

    public T getItem() {
        return item;
    }

    public int getPrice() {
        return (int) price;
    }
}
