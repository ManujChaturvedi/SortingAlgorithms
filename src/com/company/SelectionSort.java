package com.company;

public class SelectionSort {


    public void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public void selectionSort(int[] arr,int n){
        int j=0;
        for (j=0;j<n;j++){
            int smallIndex = j;
           for (int i=j;i<n;i++){
               if (arr[i]<arr[smallIndex]){
                   smallIndex= i;
               }
           }
           swap(arr,j,smallIndex);
        }
    }
}
