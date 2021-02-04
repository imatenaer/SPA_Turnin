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
    public void add(int k){ //works 100% of the time
        Node newNode = new Node(k);

        newNode.next = this.headNode;

        this.headNode = newNode;
    }
    public void remove(int index){ //works 100% of the time :)
        Node currentNode = this.headNode;
        Node previousNode = null;
        Node nextNode = null;
        int i = 0;
        while (currentNode != null){
            if(index == 0){
                this.headNode = currentNode.next;
                break;
            }
            nextNode = currentNode.next;

            if(i == index){
                previousNode.next = nextNode;
                break;
            }
            previousNode = currentNode;
            currentNode = nextNode;
            i++;
        }
    }
    public void insert(int k, int index){
        Node node = new Node(k);
        if(index == 0){
            node.next = headNode;
            headNode = node;
        } else{
            Node currentNode = headNode;
            for(int i = 0; i < index - 1; i++){
                currentNode = currentNode.next;
            }
            Node next = currentNode.next;
            currentNode.next = node;
            node.next = next;
        }
    }
    public void switchTwo(int index1, int index2){
        Node currentNode = headNode;
        Node node = null;
        Node previousNode = null;
        if(index1 == 0){
            node = headNode;
        } else {
            for(int i = 0; i < index1 - 1; i++){
                currentNode = currentNode.next;
            }
            node = currentNode.next;
            previousNode = currentNode;
        }
        currentNode = headNode;
        for(int i = 0; i < index2 - 1; i++){
            currentNode = currentNode.next;
        }
        Node node2 = currentNode.next;
        Node previousNode2 = currentNode;

        if(index1 == 0){
            headNode = node2;
            previousNode2.next = node;
            Node temp = node.next;
            node.next = node2.next;
            node2.next = temp;
        } else {
            previousNode = node2;
            previousNode2 = node;
            Node temp = node.next;
            node.next = node2.next;
            node2.next = temp;
        }
    }
    public void reverse(){
        Node currentNode = headNode;
        Node temp = null;
        while(currentNode.next != null){
            Node temp2 = currentNode.next;
            currentNode.next = temp;
            temp = currentNode;
            currentNode = temp2;
        }
        currentNode.next = temp;
        headNode = currentNode;
    }
    public Node last(){
        Node currentNode = headNode;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}
