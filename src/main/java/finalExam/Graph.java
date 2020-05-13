package finalExam;

public class Graph {
    private Edge[] graph; // adjacency list for this graph

    public Graph(int numVertices) {
        graph = new Edge[numVertices];
    }

    public void addEdge(int nodeId, Edge edge) {
        Edge current = graph[nodeId];
        graph[nodeId] = edge;
        if (current != null) {
            edge.next = current;
        }
    }

    public void runDFS(int source, boolean[] visited) {
            // FILL IN CODE


    }

    /**
     * A method for creating a simple graph and running dfs.
     * Do not modify.
     */
    public void createGraphTestDFS() {
        addEdge(0, new Edge(2));
        addEdge(0, new Edge(1));
        addEdge(1, new Edge(4));
        addEdge(1, new Edge(0));
        addEdge(2, new Edge(3));
        addEdge(3, new Edge(4));
        addEdge(3, new Edge(0));
        addEdge(4, new Edge(0));
        addEdge(4, new Edge(6));
        addEdge(4, new Edge(5));
        boolean[] visited = new boolean[graph.length]; // initialized to false
        runDFS(0, visited);
    }


    public class Edge { // Inner class Edge
        private int neighbor; // id of the neighbor (
        private Edge next; // reference to the next "edge"

        public Edge(int neighbor) {
            this.neighbor = neighbor;
            next = null;
        }
    } // class Edge

    public static void main(String[] args) {
        int numVertices = 7;
        Graph g = new Graph(numVertices);
        g.createGraphTestDFS();
    }
}
