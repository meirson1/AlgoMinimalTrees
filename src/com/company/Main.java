package com.company;

import java.util.Random;

public class Main {

    static int N=20;

    public static void main(String[] args) {
        MST t = new MST();
        Random rand = new Random();
        int graph[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i==j)
                    graph[i][j]=0;
                else
                    graph[i][j]= rand.nextInt(25);
            }
        }

        // Print the solution
        t.primMST(graph);
    }
}
