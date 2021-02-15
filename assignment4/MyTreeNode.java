package assignment4;

public class MyTreeNode{
    public int data;
    public MyTreeNode leftNext;
    public MyLinkedList rightNext;

    MyTreeNode(int d){
        this.data = d;
        this.leftNext = null;
        this.rightNext = null;
    }
}