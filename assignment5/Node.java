package assignment5;

public class Node {
    //data
    public int data;
    public Node next;

    Node(int d){
        this.data = d;
        this.next = null;
    }

    public void link(Node node){
        this.next = node;
    }
}
