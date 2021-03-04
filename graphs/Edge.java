package graphs;
import java.util.ArrayList;

public class Edge {
    private Node node1;
    private Node node2;
    public int length;


    public Edge(Node n1, Node n2, int w){
        this.node1 = n1;
        this.node2 = n2;

        this.length = w;

        node1.connected.add(node2);
        node2.connected.add(node1);
    }
    public void addNode(Node n){

    }
}
