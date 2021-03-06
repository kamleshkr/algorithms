package com.kamlesh.trials.algorithms.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    @DisplayName("Insertion sort test")
    @Test
    public void testInsertionSort() {
        int[] testArray = new int[]{3, 1, 8, 4, 6, 10, 2, 5};
        int[] sortedArray = new int[]{1, 2, 3, 4, 5, 6, 8, 10};
        InsertionSort sorter = new InsertionSort();
        sorter.sort(testArray);
        assertArrayEquals(sortedArray, testArray);
    }


}