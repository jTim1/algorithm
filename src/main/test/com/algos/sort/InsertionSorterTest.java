package com.algos.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InsertionSorterTest<T extends Comparable<T>> {

    @Test
    public void should_sort_an_array_of_character() {
        InsertionSorter<Character> insertionSorter = new InsertionSorter<Character>();
        Character actualTab[] = new Character[]
                {'M', 'E', 'R', 'G', 'E', 'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        Character[] expectedLongesult = new Character[]
                {'A', 'E', 'E', 'E', 'E', 'G', 'L', 'M', 'M', 'O', 'P', 'R', 'R', 'S', 'T', 'X'};

        insertionSorter.sort(actualTab);

        Assert.assertArrayEquals(expectedLongesult, actualTab);

    }

    @Test
    public void should_sort_an_array_of_integer() {
        InsertionSorter<Integer> insertionSorter = new InsertionSorter<Integer>();
        Integer actualTab[] = new Integer[]{20, 9, 15, 18, 1, 7};
        Integer expectedTab[] = new Integer[]{1, 7, 9, 15, 18, 20};

        insertionSorter.sort(actualTab);

        Assert.assertArrayEquals(expectedTab, actualTab);
    }
}
