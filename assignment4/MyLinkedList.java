package assignment4;

public class MyLinkedList {

    public Node headNode;
    public MyLinkedList(Node n){
        this.headNode = n;
    }

    public void printList(){
        Node currentNode = this.headNode;
        while(currentNode != null){
            System.out.print(headNode.data);
            currentNode = currentNode.next;
        }
    }

    public void append(int k){
        
    }
}
