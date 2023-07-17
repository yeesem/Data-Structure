/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labTestRevision;

public class Node<ValueType>{
    private ValueType value;
    private String edgeName1;
    private String edgeName2;
    private Node<ValueType>edgeNode1;
    private Node<ValueType>edgeNode2;
    
    public Node(ValueType val){
        this.value = val;
    }
    
    public void setEdge1(String edgeName,Node<ValueType>node){
        edgeNode1 = node;
        edgeName1 = edgeName;
    }    
    
    public void setEdge2(String edgeName,Node<ValueType>node){
        edgeNode2 = node;
        edgeName2 = edgeName;
    }
    
    public ValueType getValue(){
        return this.value;
    }
    
    public void printEdgesAndNodes(){
        System.out.println("-------------------------------------");
        System.out.println(this.getValue());
        System.out.println("   :" + this.edgeName1 + "->");
        System.out.println("        " + edgeNode1.value);
        System.out.println("   :" + this.edgeName2 + "->");
        System.out.println("        " + edgeNode2.value);
        System.out.println("-------------------------------------");
    }
    
    public Node traverse(String content){
        if(content.equals(edgeName1)){
            return edgeNode1;
        }
        else if(content.equals(edgeName2)){
            return edgeNode2;
        }
        return null;
    }
}
