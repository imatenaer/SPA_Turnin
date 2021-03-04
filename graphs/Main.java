package graphs;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");
        Node h = new Node("h");
        Node i = new Node("i");
        Node j = new Node("j");
        Edge aj = new Edge(a, j, 1);
        Edge jb = new Edge(j, b, 2);
        Edge jh = new Edge(j, h, 3);
        Edge ji = new Edge(j, i, 4);
        Edge hd = new Edge(h, d, 4);
        Edge df = new Edge(d, f, 1);
        Edge de = new Edge(d, e, 2);
        Edge ef = new Edge(e, f, 5);
        Edge eg = new Edge(e, g, 1);
        Edge ec = new Edge(e, c, 5);
        Edge gf = new Edge(g, f, 4);
        graph.addEdge(aj);
        graph.addEdge(jb);
        graph.addEdge(jh);
        graph.addEdge(ji);
        graph.addEdge(hd);
        graph.addEdge(df);
        graph.addEdge(de);
        graph.addEdge(ef);
        graph.addEdge(eg);
        graph.addEdge(ec);
        graph.addEdge(gf);
        

    }
}
