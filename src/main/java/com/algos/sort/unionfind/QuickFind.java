package com.algos.sort.unionfind;

public class QuickFind {

    private int id[];
    public QuickFind(int size) {
        id = new int[size];
        for (int i = 0; i < size; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) id[i] = qid;
            System.out.println(i + " -> " + id[i]);
        }
        System.out.println(" ");
    }

    public boolean isConnected(int p, int q) {
        if (id[p] == id[q])
            return true;
        return false;
    }
}
