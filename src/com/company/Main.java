package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array =  {5,3,1,2,4};
        BubbleSort bs = new BubbleSort();
        bs.printArray(array);
        bs.bubbleSort(array,array.length);
        bs.printArray(array);
    }
}
