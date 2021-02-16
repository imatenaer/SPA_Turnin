package assignment6;

public class MyBST {
    public Node headNode;
    public MyBST(Node n){
        this.headNode = n;
    }
    public Node add(Node root, int k){
        if(this.headNode == null){
            //base case
            return new Node(k);
        } else {
            //left side
            if (k < root.data){
                return add(root.leftNext, k);
            }
            //right side
            else {
                return add(root.rightNext, k);
            }
        }
        
    }
    public void printBST(){

    }
    public boolean search(int k){
        return false;
    }
}
