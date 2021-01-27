package assignment4;

public class MyLinkedList {

    public Node headNode;
    public MyLinkedList(Node n){
        this.headNode = n;
    }

    public void printList(){
        Node currentNode = this.headNode;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
    public void add(int k){
        Node newNode = new Node(k);

        newNode.next = this.headNode;

        this.headNode = newNode;
    }
}
