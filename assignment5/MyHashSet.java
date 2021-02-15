package assignment5;
import java.util.*;

public class MyHashSet{
    ArrayList<MyLinkedList> myHashSet;
    private int bucketSize;
    Node[] buckets;
    public MyHashSet(int b){
        bucketSize = b;
        myHashSet = new ArrayList<MyLinkedList>();
    }
    public void add(int k){
        if(myHashSet.size() * bucketSize >= k){
            if(!isInSet(k)){
                myHashSet.get((k-1)/bucketSize).addEnd(k);
                if(myHashSet.get((k-1)/bucketSize).headNode.data == 0){
                    myHashSet.get((k-1)/bucketSize).remove(0);
                }
            }
        }
        else {
            hash(k);
            myHashSet.get((k-1)/bucketSize).addEnd(k);
            myHashSet.get((k-1)/bucketSize).remove(0);
        }
    }
    public boolean isInSet(int k){
        if(myHashSet.size() - 1 >= (k - 1)/bucketSize){
            Node currentNode = myHashSet.get((k-1/bucketSize)).headNode;
            boolean isInSet = false;
            while(currentNode != null){
                if(currentNode.data == k){
                    isInSet = true;
                }
                currentNode = currentNode.next;
            }
            return isInSet;
        }
        else {
            return false;
        }
    }
    public void hash(int k){
        int index = ((k-1)-myHashSet.size()*bucketSize)/bucketSize + 1;
        for(int i = 0; i < index; i++){
            Node node = new Node(0);
            MyLinkedList list = new MyLinkedList(node);
            myHashSet.add(list);
        }
    }
    public String toString(){
        return myHashSet.toString();
    }
}