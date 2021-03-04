package graphs;
import java.util.ArrayList;
public class Graph {
    //nodes --> string
    //edges --> distance (int)
    /*
    a
    |  \
    c - b
    a->c = 5
    c->b = 10
    a->b = 6
    */
    public ArrayList<Edge> edges = new ArrayList<Edge>();
    public Graph(){

    }
    public void addEdge(Edge e){
        this.edges.add(e);
    }
    public int findPath(Node f, Node l){ //returns length of shortest path
        int path = 0;
        ArrayList<Node> stack = new ArrayList<>();
        Node currentNode = f;
        while(stack.contains(f) && stack.contains(l)){
            stack.add(currentNode);
            //loop thru unvisited nodes, visit it and add to stack
            //if no option, pop until u reach node with next node
            
            
        }
        return path;
    }
}
