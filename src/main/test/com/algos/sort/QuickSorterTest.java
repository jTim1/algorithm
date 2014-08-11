package com.algos.sort;


import org.junit.Assert;
import org.junit.Test;

public class QuickSorterTest<T extends Comparable<T>> {

    @Test
    public void should_sort_an_array_of_simple_character() {
        QuickSorter<Character> quickSorter = new QuickSorter<Character>();
        Character actualTab[] = new Character[]{'F', 'A', 'T', 'I', 'M', 'A'};
        Character[] expectedLongesult = new Character[]{'A', 'A', 'F', 'I', 'M', 'T'};
        quickSorter.sort(actualTab);

        Assert.assertArrayEquals(expectedLongesult, actualTab);
    }

    @Test
    public void should_sort_an_array_of_character() {
        QuickSorter<Character> quickSorter = new QuickSorter<Character>();
        Character actualTab[] = new Character[]
                {'M', 'E', 'R', 'G', 'E', 'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        Character[] expectedLongesult = new Character[]
                {'A', 'E', 'E', 'E', 'E', 'G', 'L', 'M', 'M', 'O', 'P', 'R', 'R', 'S', 'T', 'X'};
        quickSorter.sort(actualTab);

        Assert.assertArrayEquals(expectedLongesult, actualTab);
    }

    @Test
    public void should_sort_an_array_of_int() {
        QuickSorter<Integer> quickSorter = new QuickSorter<Integer>();
        Integer actualTab[] = new Integer[]{5, 43, 2, 7, 32, 9};
        Integer[] expectedLongesult = new Integer[]{2, 5, 7, 9, 32, 43};
        quickSorter.sort(actualTab);

        Assert.assertArrayEquals(expectedLongesult, actualTab);
    }
}
