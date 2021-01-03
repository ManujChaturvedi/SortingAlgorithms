package com.company;

public class SelectionSort {


    HelperFunctions hf = new HelperFunctions();

    public void sort(int[] arr,int n){
        int j=0;
        for (j=0;j<n;j++){
            int smallIndex = j;
            for (int i=j;i<n;i++){
               if (arr[i]<arr[smallIndex]){
                   smallIndex= i;
               }
           }
           hf.swap(arr,j,smallIndex);
        }
    }
}
