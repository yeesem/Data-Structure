/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB12;

import java.util.ArrayList;
public class BST<E extends Comparable<E>>{
    
    private TreeNode<E>root;
    private int size;
    
    public boolean search(E e){
        for(TreeNode<E>current=root;current!=null;){
            if(current.data.equals(e))
                return true;
            
            current = e.compareTo(current.data)<0? current.left : current.right;
        }
        return false;
    }
    
    public boolean insert(E e){
        if(root==null){ 
            this.root = new TreeNode(e);
            this.size++;
            return true;
        }  
        else{
            TreeNode<E>parent=null;
            for(TreeNode<E>current=root;current!=null;){
                if(current.data.equals(e))
                    return false;
                parent = current;
                current = e.compareTo(current.data)<0? current.left : current.right;
            }
            if(e.compareTo(parent.data)<0)
                parent.left = new TreeNode<>(e);
            else
                parent.right = new TreeNode<>(e);
        }
        this.size++;
        return true;
    }   
    
    public int getSize(){
        return this.size;
    }
    
    public int height(){
        return height(root);
    }
    
    public int height(TreeNode<E>root){
        if(root==null)
            return -1;
        int heightLeft = this.height(root.left);
        int heightRight = this.height(root.right); 
        return Math.max(heightLeft,heightRight)+1;
    }
    
    public E getRoot(){
        return this.root.data;
    }
    
    public E minValue(){
        TreeNode<E>current = root;
        while (current.left!=null) {
            current = current.left;
        }
        return current.data;
    }
    
    public E maxValue(){
        E max = null;
        for (TreeNode<E>current=root;current!=null;current=current.right) {
            max = current.data;
        }
        return max;
    }
    
    public java.util.ArrayList<TreeNode<E>>path(E e){
        if(root==null)
            return null;
        ArrayList<TreeNode<E>>list = new ArrayList<>();
        for(TreeNode<E>current=root;current!=null;){
            list.add(current);
            if(e.equals(current.data))
                break;
            current = e.compareTo(current.data)<0?current.left : current.right;
        }
        return list;
    }
    
    public boolean delete(E e){
        if(!search(e))
            return false;
        TreeNode<E>parent = null;
        TreeNode<E>current = null;
        for (current=root;current!=null;) {
            if(current.data.equals(e))
                break;
            parent = current;
            current = e.compareTo(current.data)<0? current.left : current.right;
        }
        
        //Case 1 current node does not have a left child
        if(current.left==null){
            if(parent==null)
                root = current.right;
            else if(e.compareTo(current.data)<0)
                parent.left = current.right;
            else if(e.compareTo(current.data)>0)
                parent.right = current.right;
        }else{
            TreeNode<E>parentRightMost = current;
            TreeNode<E>rightMost = current.left;
            while (rightMost.right!=null) {
                parentRightMost = rightMost;
                rightMost = rightMost.right;
            }
            current.data = rightMost.data;
            
            //Dont have rightMost remain same as 
            //parentRightMost = current;
            //RightMost = current.left;
            if(parentRightMost.left==rightMost)
                parentRightMost.left = rightMost.left;
            else
                parentRightMost.right = rightMost.left;
            }
        this.size--;
        return true;
    }
    
    public boolean clear(){
        root = null;
        this.size = 0;
        return true;
    }
    
    //Unable to pass root in main class
    public void inOrder(){
        inOrder(this.root);
    }
    
    protected void inOrder(TreeNode<E>root){
        if(root==null)
            return ;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
    public void preOrder(){
        preOrder(this.root);
    }
    
    protected void preOrder(TreeNode<E>root){
        if(root==null)
            return ;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public void postOrder(){
        postOrder(this.root);
    }
    
    protected void postOrder(TreeNode<E>root){
        if(root==null)
            return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
