package com.company;

import java.util.Arrays;

public class Main {

    public static void printArray(int[] arr){
        for (int i:arr) System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        int[] array =  {8,5,3,7,5};
        printArray(array);
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array,0, array.length);
        printArray(array);
//        Arrays.toString(array);
    }
}
