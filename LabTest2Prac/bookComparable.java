/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2Prac;

import java.util.Collections;
import java.util.PriorityQueue;

public class bookComparable {
    public static void main(String[] args) {
        PriorityQueue<compareBook> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(new compareBook(50,"Nice to see you"));
        queue.offer(new compareBook(40,"Robert Kuok"));
        queue.offer(new compareBook(80,"How to win friends and influence people"));
        queue.offer(new compareBook(60,"Homosepain"));
        
        System.out.println(queue);
    }
}

class compareBook implements Comparable<compareBook>{
    private Integer page;
    private String name;
    
    public compareBook(int page,String name){
        this.page = page;
        this.name = name;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(compareBook o) {
//        return o.getPage().compareTo(this.getPage());
        return o.getPage() - this.getPage();
    }
    
    @Override 
    public String toString(){
        return "( Name : " + this.name + ", page : " + this.page + ")"; 
    }
}


