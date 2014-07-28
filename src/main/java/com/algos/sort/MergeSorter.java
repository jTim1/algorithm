package com.algos.sort;


import java.util.ArrayList;
import java.util.List;

public class MergeSorter<T extends Comparable<T>> implements Sorter<T> {

    public void sort(T[] tab) {
        mergeSort(tab);
    }

    public void mergeSort(T tab[]) {
        recursiveMergeSort(tab, 0, tab.length - 1);
    }

    private void recursiveMergeSort(T[] tab, int g, int d) {
        if (g == d) {
            return;
        }
        int middle = (d + g) / 2;
        recursiveMergeSort(tab, g, middle);
        recursiveMergeSort(tab, middle + 1, d);
        int size = d - g + 1;
        List<T> listResult = new ArrayList<T>(size);
        T[] resultMerge = (T[]) listResult.toArray();
        merge(tab, g, middle, d, resultMerge);
    }

    void merge(T[] tab, int g, int middle, int d, T[] resultMerge) {
        int i = g;
        int j = middle + 1;
        int k = 0;
        while (k < resultMerge.length) {
            if (i > j) {
                resultMerge[k++] = tab[j];
                continue;
            }
            if (j > d) {
                resultMerge[k++] = tab[i];
                continue;
            }
            if (tab[i].compareTo(tab[j]) < 0) {
                resultMerge[k++] = tab[i++];
            } else {
                resultMerge[k++] = tab[j++];
            }
        }
    }
}
