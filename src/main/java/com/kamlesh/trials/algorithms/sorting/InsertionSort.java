package com.kamlesh.trials.algorithms.sorting;

public class InsertionSort {

    public void sort(int[] arr) {
        int temp, j;

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j -1] > temp) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
