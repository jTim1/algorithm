package com.algos.sort;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSorterTest<T extends Comparable<T>> {

    @Test
    public void should_sort_an_array_of_character() {
        SelectionSorter<Character> selectionSorter = new SelectionSorter<Character>();
        Character actualTab[] = new Character[]
                {'M', 'E', 'R', 'G', 'E', 'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        Character[] expectedLongesult = new Character[]
                {'A', 'E', 'E', 'E', 'E', 'G', 'L', 'M', 'M', 'O', 'P', 'R', 'R', 'S', 'T', 'X'};

        selectionSorter.sort(actualTab);

        Assert.assertArrayEquals(expectedLongesult, actualTab);

    }

    @Test
    public void should_sort_an_array_of_integer() {
        SelectionSorter<Integer> selectionSorter = new SelectionSorter<Integer>();
        Integer actualTab[] = new Integer[]{20, 9, 15, 18, 1, 7};
        Integer expectedTab[] = new Integer[]{1, 7, 9, 15, 18, 20};

        selectionSorter.sort(actualTab);

        Assert.assertArrayEquals(expectedTab, actualTab);
    }

}
