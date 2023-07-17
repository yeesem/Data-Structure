/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB12;

public class TreeNode<E extends Comparable<E>>{
    E data;
    TreeNode<E>right;
    TreeNode<E>left;
    
    public TreeNode(E data){
        this.data = data;
    }
}
