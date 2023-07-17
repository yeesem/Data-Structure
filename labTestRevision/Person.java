/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labTestRevision;

public class Person {
     private String name;
     private int age;
     
     public Person(String name, int age) {
       this.name = name;
       this.age = age;
     }
     public String toString() {
       return String.format("%s (age=%s)", this.name, this.age);
 }
}

