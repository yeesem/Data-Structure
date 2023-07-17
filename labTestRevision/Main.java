/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labTestRevision;

class Main {
 public static void main(String[] args) {
     Node<Person> anwarIbrahim = new Node<>(new Person("Anwar Ibrahim", 75));
     Node<Person> wanAzizah = new Node<>(new Person("Wan Azizah", 70));
     Node<Person> nurIzzah = new Node<>(new Person("Nur Izzah Anwar", 42));
     
         anwarIbrahim.setEdge1("wife", wanAzizah);
         wanAzizah.setEdge1("husband", anwarIbrahim);
         anwarIbrahim.setEdge2("daughter", nurIzzah);
         nurIzzah.setEdge1("father", anwarIbrahim);
         wanAzizah.setEdge2("daughter", nurIzzah);
         nurIzzah.setEdge2("mother", wanAzizah);
         
         anwarIbrahim.printEdgesAndNodes();
         wanAzizah.printEdgesAndNodes();
         nurIzzah.printEdgesAndNodes();
 }
}