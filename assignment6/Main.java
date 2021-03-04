package assignment6;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Node n = new Node(5);
        MyBST bst = new MyBST(n);
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            bst.add(rand.nextInt(10));
        }
        bst.print();
    }
}
