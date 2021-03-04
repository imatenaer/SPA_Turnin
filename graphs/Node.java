package graphs;
import java.util.ArrayList;
public class Node {

    public String data;
    public boolean visit;
    public ArrayList<Node> connected;
    Node(String d){
        this.data = d;

    }
}
