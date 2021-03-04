package assignment6;

public class MyBST {
    public Node headNode;
    public MyBST(Node n){
        this.headNode = n;
    }
    public void add(int k) {
		this.headNode = add_recursive_call(this.headNode, k);
	}
	
	public Node add_recursive_call(Node root, int k) {
		//Base Case
		if (root == null) {
			return new Node(k);
		}
		else {
			//left side
			if (k < root.data) {
				root.leftNext = add_recursive_call(root.leftNext, k);
			}
			//right side
			else {
				root.rightNext = add_recursive_call(root.rightNext, k);
			}
		}
		return root;
	}
    public void print(){
        printBinaryTree(headNode, 0);
    }
    public static void printBinaryTree(Node root, int level){  //help from stackoverflow
        if(root==null)
             return;
        printBinaryTree(root.rightNext, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
            System.out.println("|-------"+root.data);
        }
        else
            System.out.println(root.data);
        printBinaryTree(root.leftNext, level+1);
    }  
}
