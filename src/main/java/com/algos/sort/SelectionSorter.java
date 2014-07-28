package com.algos.sort;


public class SelectionSorter<T extends Comparable<T>> implements Sorter<T> {

    public void sort(T[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j].compareTo(tab[min]) < 0) {
                    min = j;
                }
            }
            T temp;
            if (min != i) {
                temp = tab[min];
                tab[min] = tab[i];
                tab[i] = temp;
            }
        }
    }
}
