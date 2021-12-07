package com.company;

import java.util.HashMap;
import java.util.Random;

public class Main {

    static int N=4;

    public static void main(String[] args) {
        MST t = new MST();
        Random rand = new Random();
        int[][] graph = new int[][]{    {0,1,2,13},
                                        {1,0,10,24},
                                        {2,10,0,9},
                                        {13,24,9,0}};
//        for (int i = 0; i < N; i++) {
//            for (int j = 1+i; j < N; j++) {
//                if (i!=j)
//                    graph[i][j]= 1+rand.nextInt(25);
//            }
//        }
     //   setGraph(graph);
        // Print the solution
        int[] parents=t.primMST(graph);
        AddEdge(rand,parents,graph);

        t.NewMst(parents,graph);
    }

    public static void setGraph(int[][] graph)
    {
        for (int i = 0; i < N; i++) {
            for (int j = 1+i; j < N; j++) {
                graph[j][i]=graph[i][j];
            }
        }
    }

    public static void AddEdge(Random rand, int[] parents, int[][] graph)
    {
        boolean flag=false;
        do {
            int weight=1+rand.nextInt(24);
            int indexI=1+rand.nextInt(N-1);
            int indexJ=1+rand.nextInt(N-1);
            if (graph[indexI][indexJ]!=weight && indexI!=indexJ)
            {
                if (indexI!=parents[indexJ]) {
                    graph[indexI][indexJ]=weight;
                    graph[indexJ][indexI]=weight;
                    flag = true;
                }
            }
        }while (!flag);
    }

}
