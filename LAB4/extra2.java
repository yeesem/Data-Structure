/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

public class extra2 {
    public static void main(String[] args) {
        solutionReverse s = new solutionReverse();
        Node nodeaa = new Node(1);
        Node nodebb = new Node(2);
        Node nodecc = new Node(3);
        Node nodedd = new Node(4);
        
        nodeaa.next = nodebb;
        nodebb.next = nodecc;
        nodecc.next = nodedd;
        
        Node ans = s.reverse(nodeaa);
        while (ans!=null) {
            System.out.print(ans.val+" ");
            ans = ans.next;
        }
    }
}

class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
}

class solutionReverse{
    public Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while (curr!=null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}