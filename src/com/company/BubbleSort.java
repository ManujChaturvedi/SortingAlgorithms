package com.company;

public class BubbleSort {

    public void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public void bubbleSort(int[] arr,int n){
        for (int unsortedIndex=n-1;unsortedIndex>0;unsortedIndex--){
            for (int i=0;i<unsortedIndex;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    public void printArray(int[] arr){
        for (int i:arr) System.out.print(i+" ");
        System.out.println();
    }

}
