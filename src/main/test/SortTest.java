import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortTest {

    private Sort sort;

    @Before
    public void init() {
        sort = new Sort();
    }

    @Test
    public void testInsertionSortTable() {
        int tab[] = new int[]{20, 9, 15, 18, 1, 7};
        sort.insertionSort(tab);
        Assert.assertArrayEquals(new int[]{1, 7, 9, 15, 18, 20}, tab);
    }

    @Test
    public void testSelectionSortTable() {
        int tab[] = new int[]{20, 9, 15, 18, 1, 7};
        sort.selectionSort(tab);
        Assert.assertArrayEquals(new int[]{1, 7, 9, 15, 18, 20}, tab);
    }

    @Test
    public void testMerge() {
        int tab[] = new int[]{8, 23, 3, 9};
        int middle = (tab.length - 1) / 2;
        int[] resultMerge = new int[tab.length];
        sort.merge(tab, 0, middle, tab.length - 1, resultMerge);
        Assert.assertArrayEquals(new int[]{3, 8, 9, 23}, resultMerge);
    }

    //@Test
    public void testMergeSortTable() {
        int tab[] = new int[]{20, 9, 15, 18, 1, 7};
        sort.mergeSort(tab);
        Assert.assertArrayEquals(new int[]{1, 7, 9, 15, 18, 20}, tab);
    }

    @Test
    public void testShellSortShortTable() {
        char shortTab[] = new char[]{'M', 'E', 'R', 'G', 'E', 'S', 'O', 'R', 'T'};
        sort.shellSort(shortTab);
        char[] expectedShortResult = new char[]{'E', 'E', 'G', 'M', 'O', 'R', 'R', 'S', 'T'};
        Assert.assertArrayEquals(expectedShortResult, shortTab);
    }

    //@Test
    public void testShellSortLongTable() {
        char longTab[] = new char[]{'M', 'E', 'R', 'G', 'E', 'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        char[] expectedLongesult = new char[]
                {'A', 'E', 'E', 'E', 'E', 'G', 'L', 'M', 'M', 'O', 'P', 'R', 'R', 'S', 'T', 'X'};
        sort.shellSort(longTab);
        Assert.assertArrayEquals(expectedLongesult, longTab);
    }

    @Test
    public void testSwap() {
        char tab[] = new char[]{'S', 'W', 'A'};
        int i = 0;
        int j = 1;
        sort.swap(tab, j, i);
        Assert.assertArrayEquals(new char[]{'W', 'S', 'A'}, tab);
    }
}
