package assignment4;
//collab w lyle henry leo and hayden
public class Main {
    public static void main(String[] args){
        Node node = new Node(5);

        MyLinkedList mll = new MyLinkedList(node);

        mll.printList();

        mll.add(9);
        mll.add(10);

        mll.printList();
    }
}
