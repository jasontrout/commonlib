package com.jtrout.algorithms.sorting;

import java.util.Arrays;

public class SortDriver {

    public static void main(String[] args) {
        int[] items = { 3, 7, 4, 9, 5, 2, 6, 1 };
        SortStrategy sortStrategy = new BubbleSortStrategy();       
        sortStrategy.sort(items);
        System.out.println(Arrays.toString(items));
    }
}