/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

public class TestSList {
    public static void main(String[] args) {
        SList<String>list = new SList<>();
        list.appendFirst("Lisked list");
        list.appendEnd("is");
        list.appendEnd("easy");
        list.display();
        list.removeInitial();
        list.display();
        System.out.println(list.contains("difficult"));
        list.clear();
        System.out.print("After clear : ");
        list.display();
    }
}