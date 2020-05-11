package codeCamp4;

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

    public int findShortestPath(int v1, int v2) {
        // FILL IN CODE: use BFS


        return 0; // change
    }

    public class Edge { // Inner class Edge
        private int neighbor; // id of the neighbor (
        private Edge next; // reference to the next "edge"

        public Edge(int neighbor) {
            this.neighbor = neighbor;
            next = null;
        }
    } // class Edge


}
