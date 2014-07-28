package com.algos.sort.unionfind;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickFindTest {
    QuickFind quickFind;

    @Before
    public void setUp() {
        quickFind = new QuickFind(10);
    }

    @Test
    public void should_not_be_connected() {
        boolean isConnected = quickFind.isConnected(2, 7);
        assertFalse(isConnected);
    }

    @Test
    public void should_be_connected(){
        quickFind.union(3,4);
        quickFind.union(4,8);
        quickFind.union(8,0);
        boolean isConnected = quickFind.isConnected(3, 0);
        assertTrue(isConnected);
    }
}
