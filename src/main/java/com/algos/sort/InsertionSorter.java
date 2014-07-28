package com.algos.sort;

public class InsertionSorter<T extends Comparable<T>> implements Sorter<T> {

    public void sort(T[] tab) {
        T temp;
        int i, j;
        for (i = 1; i < tab.length; i++) {
            temp = tab[i];
            for (j = i; j > 0 && tab[j - 1].compareTo(temp) > 0; j--) {
                tab[j] = tab[j - 1];
            }
            tab[j] = temp;
        }
    }
}
