/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

public class ArrayBagDemo{
    private static void testAdd(BagInterface<String>aBag,String[]content){
        System.out.print("Adding ");
        for (int i = 0; i < content.length; i++) {
            System.out.print(content[i] + " ");
            aBag.add(content[i]);
        }
        System.out.println();
    }
    
    public static void display(BagInterface<String>bag){
        System.out.println("The bag contains " + bag.getCurrentSize() + " String(s), as follow:");
        Object [] tempt = bag.toArray();
        for (int i = 0; i <bag.getCurrentSize(); i++) {
            System.out.print(tempt[i] + " ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        String [] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String [] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        
        BagInterface<String>aBag = new ArrayBag<>();
        BagInterface<String>bBag = new ArrayBag<>();
        
        System.out.println("Bag1: ");testAdd(aBag,contentsOfBag1);display(aBag);
        System.out.println("Bag2: ");testAdd(bBag,contentsOfBag2);display(bBag);

        System.out.println("Bag3, test the method union of bag1 and bag2:");display(aBag.Union(bBag));
        System.out.println("Bag4, test the method intersection of bag1 and bag2:");display(aBag.Intersect(bBag));
        System.out.println("Bag5, test the method difference of bag1 and bag2:");display(aBag.Difference(bBag));
      }
    }

