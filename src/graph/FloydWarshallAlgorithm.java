package graph;

public class FloydWarshallAlgorithm {

    static final int INF = Integer.MAX_VALUE;

    public static void floydWarshall(int[][] graph, int vertices) {
        int[][] distance = new int[vertices][vertices];

        // Initialize distance matrix with the provided graph
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                distance[i][j] = graph[i][j];
            }
        }

        // Apply the Floyd-Warshall algorithm
        for (int k = 0; k < vertices; k++) {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    if (distance[i][k] != INF && distance[k][j] != INF &&
                            distance[i][k] + distance[k][j] < distance[i][j]) {
                        distance[i][j] = distance[i][k] + distance[k][j];
                    }
                }
            }
        }

        // Print the result
        printSolution(distance, vertices);
    }

    public static void printSolution(int[][] distance, int vertices) {
        System.out.println("Shortest distances between all pairs of vertices:");
        for (int i = 0; i < vertices; ++i) {
            for (int j = 0; j < vertices; ++j) {
                if (distance[i][j] == INF) {
                    System.out.print("INF\t");
                } else {
                    System.out.print(distance[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertices = 4;
        int[][] graph = {
                {0, 5, INF, 10},
                {INF, 0, 3, INF},
                {INF, INF, 0, 1},
                {INF, INF, INF, 0}
        };

        floydWarshall(graph, vertices);
    }
}

