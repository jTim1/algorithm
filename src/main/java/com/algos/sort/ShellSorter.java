package com.algos.sort;


public class ShellSorter<T extends Comparable<T>> implements Sorter<T> {

    public void sort(T[] tab) {
        int initialStep = 1;
        while (initialStep < tab.length / 3) {
            initialStep = initialStep * 3 + 1;
        }
        for (int currentStep = initialStep; currentStep >= 1; currentStep /= 3) {
            for (int i = currentStep; i < tab.length; i++) {
                T temp = tab[i];
                int j;
                for (j = i; j >= currentStep && tab[j].compareTo(tab[j - currentStep]) <= 0; j -= currentStep) {
                    if (temp.compareTo(tab[j - currentStep]) < 0) {
                        tab[j] = tab[j - currentStep];
                    } else {
                        break;
                    }
                }
                tab[j] = temp;
            }
        }
    }
}
