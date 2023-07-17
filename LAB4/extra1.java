/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

public class extra1 {
    public static void main(String[] args) {
        solutionMerge s = new solutionMerge();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(4);
        
        Node nodea = new Node(1);
        Node nodeb = new Node(3);
        Node nodec = new Node(4);
        
        node1.next = node2;
        node2.next = node3;
        
        nodea.next = nodeb;
        nodeb.next = nodec;
        
        Node ans = s.mergeNode(node1, nodea);
        while (ans!=null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
        System.out.println();
    }
}

class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
}

class solutionMerge{
    public Node mergeNode(Node a,Node b){
        Node tempt = new Node(0);
        Node ans = tempt;
        while (a!=null && b!=null){
            if(a.val<b.val){
                ans.next = a;
                a = a.next;
            }
            else{
                ans.next = b;
                b = b.next;
            }
            ans = ans.next;
        }
        if (a!=null) {
            ans.next = a;
        }
        if (b!=null) {
            ans.next = b;
        }
         
        return tempt.next;
    }
}