package assignment4;

public class MyLinkedList {

    public Node headNode;
    public MyLinkedList(Node n){
        this.headNode = n;
    }

    public void printList(){
        Node currentNode = this.headNode;
        System.out.print(headNode.data);
    }
}
