package structures.graphs;

import java.util.*;

class OrientedGraph {
    private int numVertices;
    private LinkedList<Integer> adjLists[];

    OrientedGraph(int vertices) {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest) {
        adjLists[src].add(dest); // Для ориентированного графа
    }

    void printGraph() {
        for(int v = 0; v < numVertices; v++) {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(Integer pCrawl: adjLists[v]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
    }

    public static void main(String args[]) {
        OrientedGraph g = new OrientedGraph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}