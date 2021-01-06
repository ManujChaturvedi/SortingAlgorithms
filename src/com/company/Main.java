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
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array,0, array.length-1);
        printArray(array);
    }
}
