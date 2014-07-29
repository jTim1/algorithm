package com.algos.sort;

public class InsertionSorter<T extends Comparable<T>> implements Sorter<T> {

    public void sort(T[] tab) {
        int i, j;
        for (i = 1; i < tab.length; i++) {
            for (j = i; j > 0 && tab[j - 1].compareTo(tab[j]) > 0; j--) {
                SorterHelper.swap(tab, j, j - 1);
            }
        }
    }
}
