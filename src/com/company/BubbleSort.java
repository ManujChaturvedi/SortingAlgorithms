package com.company;

public class BubbleSort {

    HelperFunctions helperFunctions = new HelperFunctions();

    public void sort(int[] arr,int n){
        for (int unsortedIndex=n-1;unsortedIndex>0;unsortedIndex--){
            for (int i=0;i<unsortedIndex;i++){
                if(arr[i]>arr[i+1]){
                    helperFunctions.swap(arr,i,i+1);
                }
            }
        }
    }


}
