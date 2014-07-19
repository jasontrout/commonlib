package com.jtrout.algorithms.sorting;

public class BubbleSortStrategy extends SortStrategy {

    @Override
    public void sort(int[] items) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < items.length; i++) {
                if (items[i - 1] > items[i]) {
                    int temp = items[i];
                    items[i] = items[i - 1];
                    items[i - 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}