package assignment4;

public class Main {
    public static void main(String[] args){
        Node node = new Node(5);

        MyLinkedList mll = new MyLinkedList(node);

        mll.add(9);
        mll.add(10);
        mll.add(11);
        mll.add(13);

        mll.printList();
        System.out.println();

        mll.remove(0);
        mll.printList();
        System.out.println();
        mll.insert(4, 2);
        mll.printList();
        System.out.println();
        mll.switchTwo(4, 1);
        mll.printList();
        System.out.println();
        mll.reverse();
        mll.printList();

        Node mergeNode = new Node(0);
        MyLinkedList mergeList = new MyLinkedList(mergeNode);
        mergeList.add(1);
        mergeList.add(7);
        mergeList.printList();
        mll = merge(mll, mergeList);
        mll.printList();
    }
    public static MyLinkedList merge(MyLinkedList lst1, MyLinkedList lst2){
        lst1.last().next = lst2.headNode;
        Node nodeOne = lst1.headNode;
        Node nodeTwo = lst1.headNode;
        int x = 0;
        int y = 0;
        while(nodeOne != null){
            nodeTwo = nodeOne.next;
            y = x + 1;
            while(nodeTwo != null){
                if(nodeTwo.data < nodeOne.data){
                    lst1.switchTwo(x, y);
                    Node temp = nodeOne;
                    nodeOne = nodeTwo;
                    nodeTwo = temp;
                }
                y++;
                nodeTwo = nodeTwo.next;
            }
            x++;
            nodeOne = nodeOne.next;
        }
        return lst1;
    }
}
