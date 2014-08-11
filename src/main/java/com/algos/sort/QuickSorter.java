package com.algos.sort;


public class QuickSorter<T extends Comparable<T>> implements Sorter<T> {

    public void sort(T[] tab) {
        sort(tab, 0, tab.length - 1);
    }

    private void sort(T[] tab, int begin, int end) {
        if (begin >= end)
            return;

        int pivot = begin;
        int i = begin + 1;
        int j = end;

        while (true) {
            while (tab[i].compareTo(tab[pivot]) <= 0 && i < j) {
                i++;
            }
            while (tab[j].compareTo(tab[pivot]) > 0 && j > i) {
                j--;
            }
            if (i == j) {
                break;
            }
            SorterHelper.swap(tab, i, j);
        }

        if (tab[i].compareTo(tab[pivot]) >= 0) {
            sort(tab, begin, i - 1);
            sort(tab, i, end);
        } else {
            SorterHelper.swap(tab, pivot, i);
            sort(tab, begin, i);
            sort(tab, i + 1, end);
        }
    }

}
