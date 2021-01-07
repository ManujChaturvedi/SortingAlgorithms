package com.company;

public class Main {

    public static void printArray(int[] arr){
        for (int i:arr) System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        int[] array =  {5,3,1,2,4};
        printArray(array);
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array,0, array.length);
        printArray(array);
    }
}
