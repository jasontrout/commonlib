package com.jtrout.algorithms.sorting;

public class SelectionSortStrategy extends SortStrategy {
    @Override
    public void sort(int[] items) {
        for (int i = 1; i < items.length; i++)
        {
            int minIdx = i - 1;
            for (int j = i; j < items.length; j++)
            {
                if (items[j] < items[minIdx])
                {
                    minIdx = j;
                }
            }
            if (items[minIdx] < items[i - 1])
            {
                int temp = items[minIdx];
                items[minIdx] = items[i - 1];
                items[i - 1] = temp;
            }
        }
    }
}
