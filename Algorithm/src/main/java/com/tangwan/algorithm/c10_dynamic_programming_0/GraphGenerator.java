package com.tangwan.algorithm.c10_dynamic_programming_0;

public class GraphGenerator {

    // matrix 所有的边
    // N*3 的矩阵
    // [weight, from节点上面的值，to节点上面的值]
    public static Graph createGraph(Integer[][] matrix) {
        Graph graph = new Graph();
        for (int i = 0; i < matrix.length; i++) {
            // matrix[0][0], matrix[0][1]  matrix[0][2]
            Integer weight = matrix[i][0];
            Integer from = matrix[i][1];
            Integer to = matrix[i][2];
            if (!graph.nodes.containsKey(from)) {
                graph.nodes.put(from, new Node(from));
            }
            if (!graph.nodes.containsKey(to)) {
                graph.nodes.put(to, new Node(to));
            }
            Node fromNode = graph.nodes.get(from);
            Node toNode = graph.nodes.get(to);
            Edge newEdge = new Edge(weight, fromNode, toNode);
            fromNode.nexts.add(toNode);
            fromNode.out++;
            toNode.in++;
            fromNode.edges.add(newEdge);
            graph.edges.add(newEdge);
        }
        return graph;
    }

    public static Graph buildGraph() {
        Integer[][] matrix = new Integer[8][3];
        matrix[0][0] = 0;
        matrix[0][1] = 0;
        matrix[0][2] = 1;

        matrix[1][0] = 0;
        matrix[1][1] = 0;
        matrix[1][2] = 2;

        matrix[2][0] = 0;
        matrix[2][1] = 0;
        matrix[2][2] = 3;

        matrix[3][0] = 1;
        matrix[3][1] = 1;
        matrix[3][2] = 4;

        matrix[4][0] = 3;
        matrix[4][1] = 3;
        matrix[4][2] = 4;

        matrix[5][0] = 3;
        matrix[5][1] = 3;
        matrix[5][2] = 5;

        matrix[6][0] = 2;
        matrix[6][1] = 2;
        matrix[6][2] = 5;

        matrix[7][0] = 4;
        matrix[7][1] = 4;
        matrix[7][2] = 5;

        return createGraph(matrix);
    }
}
