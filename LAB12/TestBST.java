/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB12;

import java.util.ArrayList;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer>bst = new BST<>();
        
        int [] inputData = { 45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14};
        System.out.print("Input Data: ");
        for(int tempt:inputData){
            System.out.print(tempt + ", ");
            bst.insert(tempt);
        }
        System.out.println();
        
        System.out.print("Inorder (sorted): ");
        bst.inOrder();
        System.out.println();
        
        System.out.print("Postorder : ");
        bst.postOrder();
        System.out.println();
        
        System.out.print("Preorder : ");
        bst.preOrder();
        System.out.println();
        
        System.out.println("Height of BST: " + bst.height());
        
        System.out.println("Root of BST is: " + bst.getRoot());
        
        System.out.println("Check whether 10 is in the tree? " + bst.search(10));
        
        int delete = 53;
        bst.delete(delete);
        System.out.println("Delete " + delete);
        
        System.out.print("Updated Inorder data (Sorted): ");
        bst.inOrder();
        System.out.println();
        
        System.out.println("Min value : " + bst.minValue());
        System.out.println("Max value : " + bst.maxValue());
        
        int path = 6;
        System.out.print("A path from the root to " + path + " is: ");
        for (TreeNode<Integer> path1 : bst.path(path)) {
            System.out.print(path1.data + " ");
        }
        System.out.println();
    }
}
