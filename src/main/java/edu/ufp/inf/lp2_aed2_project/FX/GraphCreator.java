package edu.ufp.inf.lp2_aed2_project.FX;
import edu.princeton.cs.algs4.*;

public class GraphCreator {

    public EdgeWeightedDigraph createGraph() {
        int numVertices = 5;

        EdgeWeightedDigraph graph = new EdgeWeightedDigraph(numVertices);

        graph.addEdge(new DirectedEdge(0, 1, 1.0)); // Adicione as arestas do grafo conforme necessário
        graph.addEdge(new DirectedEdge(1, 2, 2.0));
        graph.addEdge(new DirectedEdge(2, 3, 3.0));
        graph.addEdge(new DirectedEdge(3, 4, 4.0));
        graph.addEdge(new DirectedEdge(4, 0, 5.0));

        return graph;
    }
}