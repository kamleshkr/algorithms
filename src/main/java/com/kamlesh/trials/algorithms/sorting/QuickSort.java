package com.kamlesh.trials.algorithms.sorting;

import java.util.Objects;

public class QuickSort {

    public void sort(int[] a) {
        if (Objects.isNull(a) || a.length < 2) {
            return;
        }
        quickSort(a, 0, a.length - 1);
    }

    public void quickSort(int[] a, int low, int high) {
        int partitionIndex = partition(a, low, high);
        if (low < partitionIndex - 1) {
            quickSort(a, low, partitionIndex - 1);
        }
        if (high > partitionIndex) {
            quickSort(a, partitionIndex, high);
        }
    }

    public int partition(int[] a, int low, int high) {
        System.out.println("partitioning array index " + low + " to " + high);
        int pivot = a[(low + high) / 2];
        System.out.println("pivot = " + pivot);
        while (low <= high) {
            while (a[low] < pivot) {
                low++;
            }
            while (a[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                low++;
                high--;
            }
        }
        for(int i: a) {
            System.out.print(i + " ");
        }
        System.out.println("partition index " + low);
        return low;
    }
}
