package graph;

import java.util.Arrays;

public class DijkstraAlgorithm {

    static class Graph {
        private int vertices;
        private int[][] adjacencyMatrix;

        public Graph(int vertices) {
            this.vertices = vertices;
            this.adjacencyMatrix = new int[vertices][vertices];
        }

        public void addEdge(int source, int destination, int weight) {
            adjacencyMatrix[source][destination] = weight;
            adjacencyMatrix[destination][source] = weight; // For undirected graph
        }

        public int[] dijkstra(int start) {
            int[] distance = new int[vertices];
            boolean[] visited = new boolean[vertices];

            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[start] = 0;

            for (int i = 0; i < vertices - 1; i++) {
                int minDistance = Integer.MAX_VALUE;
                int minIndex = -1;

                // Find the node with the smallest tentative distance
                for (int j = 0; j < vertices; j++) {
                    if (!visited[j] && distance[j] < minDistance) {
                        minDistance = distance[j];
                        minIndex = j;
                    }
                }

                // Mark the selected node as visited
                visited[minIndex] = true;

                // Update the distances of the neighbors of the selected node
                for (int j = 0; j < vertices; j++) {
                    if (!visited[j] && adjacencyMatrix[minIndex][j] != 0) {
                        int newDistance = distance[minIndex] + adjacencyMatrix[minIndex][j];
                        if (newDistance < distance[j]) {
                            distance[j] = newDistance;
                        }
                    }
                }
            }

            return distance;
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        int startNode = 0;

        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 7);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 1);

        int[] distances = graph.dijkstra(startNode);

        System.out.println("Shortest distances from node " + startNode + ":");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("To node " + i + ": " + distances[i]);
        }
    }
}
