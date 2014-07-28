package com.algos.sort;

import org.junit.Assert;
import org.junit.Test;

public class MergeSorterTest<T extends Comparable<T>> {

    @Test
    public void should_merge() {
        MergeSorter<Integer> mergeSorter = new MergeSorter<Integer>();

        Integer tab[] = new Integer[]{8, 23, 3, 9};
        int middle = (tab.length - 1) / 2;
        Integer[] resultMerge = new Integer[tab.length];
        mergeSorter.merge(tab, 0, middle, tab.length - 1, resultMerge);
        Integer[] expectedTab = {3, 8, 9, 23};
        Assert.assertArrayEquals(expectedTab, resultMerge);
    }

    //@Test
    public void should_sort_an_array_of_character() {
        MergeSorter<Character> mergeSorter = new MergeSorter<Character>();
        Character actualTab[] = new Character[]
                {'M', 'E', 'R', 'G', 'E', 'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        Character[] expectedLongesult = new Character[]
                {'A', 'E', 'E', 'E', 'E', 'G', 'L', 'M', 'M', 'O', 'P', 'R', 'R', 'S', 'T', 'X'};

        mergeSorter.sort(actualTab);

        Assert.assertArrayEquals(expectedLongesult, actualTab);

    }

    //@Test
    public void should_sort_an_array_of_integer() {
        MergeSorter<Integer> mergeSorter = new MergeSorter<Integer>();
        Integer actualTab[] = new Integer[]{20, 9, 15, 18, 1, 7};
        Integer expectedTab[] = new Integer[]{1, 7, 9, 15, 18, 20};

        mergeSorter.sort(actualTab);

        Assert.assertArrayEquals(expectedTab, actualTab);
    }

}
