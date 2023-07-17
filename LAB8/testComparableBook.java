/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB8;
import java.util.Collections;
import java.util.Queue;
public class testComparableBook {
 public static void main(String[] args) {
     Queue<ComparableBook> BookQueue = new java.util.PriorityQueue<>(Collections.reverseOrder());
     BookQueue.add(new ComparableBook(1065, "Effective Java: Third Edition"));
     BookQueue.add(new ComparableBook(3012, "Java: A Beginner Guide Seventh Edition"));
     BookQueue.add(new ComparableBook(1097, "Learn Java in One Day and Learn It Well"));
     BookQueue.add(new ComparableBook(7063, "Beginning Programming with Java (Dummies)"));
     BookQueue.add(new ComparableBook(6481, "Java: Programming Basic for Absolute Beginner"));
     
     System.out.println(BookQueue);
     
     System.out.println();
     System.out.println();
     
     while (BookQueue.peek() != null) {
     //System.out.println("Peek");
     //System.out.println("Head Element: " + BookQueue.peek());
     //System.out.println("Remove");
     //BookQueue.remove();
     //System.out.println("Book queue");
     System.out.println(BookQueue.poll());
    }
  }
}

class ComparableBook implements Comparable<ComparableBook>{
    private int page;
    private String name;
    public ComparableBook(int page,String name){
        this.page = page;
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "Name : " + name + "Page : " + page;
    }

    @Override
    public int compareTo(ComparableBook o) {
       return this.page - o.page;
    }
}
