package com.jtrout.algorithms.sorting;

public class InsertionSortStrategy extends SortStrategy {

    @Override
    public void sort(int[] items) {
        for (int i = 1; i < items.length; i++) {
            int j = i;
            while (j > 0 && items[j - 1] > items[j]) {
                int temp = items[j];
                items[j] = items[j - 1];
                items[j - 1] = temp;
                j--;
            }
        }
    }
}
