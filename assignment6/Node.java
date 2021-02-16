package assignment6;

public class Node{
    public int data;
    public Node leftNext;
    public Node rightNext;

    Node(int d){
        this.data = d;
        this.leftNext = null;
        this.rightNext = null;
    }
}