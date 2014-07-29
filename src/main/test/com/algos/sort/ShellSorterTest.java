package com.algos.sort;

import org.junit.Assert;
import org.junit.Test;

public class ShellSorterTest<T extends Comparable<T>> {

    @Test
    public void should_sort_an_array_of_character() {
        ShellSorter<Character> shellSorter = new ShellSorter<Character>();
        Character actualTab[] = new Character[]
                {'M', 'E', 'R', 'G', 'E', 'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        Character[] expectedLongesult = new Character[]
                {'A', 'E', 'E', 'E', 'E', 'G', 'L', 'M', 'M', 'O', 'P', 'R', 'R', 'S', 'T', 'X'};

        shellSorter.sort(actualTab);

        Assert.assertArrayEquals(expectedLongesult, actualTab);
    }

    @Test
    public void should_sort_an_array_of_integer() {
        ShellSorter<Integer> shellSorter = new ShellSorter<Integer>();
        Integer actualTab[] = new Integer[]{20, 9, 15, 18, 1, 7};
        Integer expectedTab[] = new Integer[]{1, 7, 9, 15, 18, 20};

        shellSorter.sort(actualTab);

        Assert.assertArrayEquals(expectedTab, actualTab);
    }

}
