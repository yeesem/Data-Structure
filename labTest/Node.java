/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labTest;

public class Node<E>{
    E val;
    Node next;
    
    private E value;
    private String edgeName1;
    private String edgeName2;
    private Node<E>edgeNode1;
    private Node<E>edgeNode2;
    
    public Node(E val){
        this.val = val;
    }
    
    public void setEdge1(String edgeName1,Node<E>node){
        this.edgeName1 = edgeName1;
        this.edgeNode1 = node;
        this.value = (E)edgeName1;
    }
    
    public void setEdge2(String edgeName2,Node<E>node){
        this.edgeNode2 = node;
        this.edgeName2 = edgeName2;
        this.value = (E)edgeName2;
    }
     
    public E getValue(){
        return this.value;
    }
    
    public void printEdgesAndNodes(){
        System.out.println(this.toString());
        System.out.println(this.val);
        System.out.println("Edges and Nodes of " + this.getValue() + ":");
        if (this.edgeName1 != null) {
            System.out.println(" - Edge 1: " + this.edgeName1 + " -> " + this.edgeNode1.getValue());
        }
        if (this.edgeName2 != null) {
            System.out.println(" - Edge 2: " + this.edgeName2 + " -> " + this.edgeNode2.getValue());
        }
    }

} 

