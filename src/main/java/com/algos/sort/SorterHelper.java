package com.algos.sort;

public class SorterHelper<T> {
    public static <T> void swap(T[] tab, int i, int j) {
        T temp;
        temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }
}
