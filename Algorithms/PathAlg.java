package Algorithms;

import java.util.*;

public class PathAlg {
    private static final int NO_PARENT = -1;

    public static Dictionary<Integer, Integer> FindShortestPath(int[][] matrix, int startStation, int stopStation) {
        int[] distances = new int[matrix.length];

        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startStation] = 0;
        boolean[] visited = new boolean[matrix.length];

        int[] parents = new int[matrix.length];
        parents[startStation] = NO_PARENT;

        while (true) {

            int shortestDistance = Integer.MAX_VALUE;
            int shortestIndex = -1;
            for (int i = 0; i < matrix.length; i++) {
                if (distances[i] < shortestDistance && !visited[i]) {
                    shortestDistance = distances[i];
                    shortestIndex = i;
                }
            }

            if (shortestIndex == -1) {
                break;
            }

            for (int i = 0; i < matrix[shortestIndex].length; i++) {
                if (matrix[shortestIndex][i] != 0 && distances[i] > distances[shortestIndex] + matrix[shortestIndex][i]) {
                    parents[i] = shortestIndex;
                    distances[i] = distances[shortestIndex] + matrix[shortestIndex][i];
                }
            }

            visited[shortestIndex] = true;
        }

        return GetStationsAndDistances(matrix, stopStation, parents);
    }


    private static Dictionary<Integer, Integer> GetStationsAndDistances(
            int[][] matrix,
            int stopStation,
            int[] parents) {
        ArrayList<Integer> path = new ArrayList<>();
        Dictionary<Integer, Integer> stationsDistances = new Hashtable<>();

        while (stopStation != NO_PARENT) {
            path.add(stopStation);
            stopStation = parents[stopStation];
        }

        Collections.reverse(path);

        // starting station and distance
        stationsDistances.put(path.get(0), 0);

        for (int i = 0; i < path.size() - 1; i++) {
            var currentNode = path.get(i);
            var nextNode = path.get(i + 1);
            System.out.print(" " + nextNode + " - ");
            System.out.print(matrix[currentNode][nextNode]);

            stationsDistances.put(nextNode, matrix[currentNode][nextNode]);
        }

        return stationsDistances;
    }


    private static void printSolution(int[][] adjacencyMatrix,
            int startVertex,
                                      int[] distances,
                                      int[] parents) {
        int nVertices = distances.length;
        System.out.print("Vertex\t Distance\tPath");

/*        for (int vertexIndex = 0;
             vertexIndex < nVertices;
             vertexIndex++) {
            if (vertexIndex != startVertex) {
                System.out.print("\n" + startVertex + " -> ");
                System.out.print(vertexIndex + " \t\t ");
                System.out.print(distances[vertexIndex] + "\t\t");
                print(adjacencyMatrix, vertexIndex, parents, 4);
                printPath(vertexIndex, parents);
                System.out.println("------");
                //printPath(vertexIndex, eDistance);


            }
        }*/

        var stopStation = 4;

        if (stopStation != startVertex) {
            System.out.print("\n" + startVertex + " -> ");
            System.out.print(stopStation + " \t\t ");
            System.out.print(distances[stopStation] + "\t\t");
            GetStationsAndDistances(adjacencyMatrix, stopStation, parents);
        }
    }
}
