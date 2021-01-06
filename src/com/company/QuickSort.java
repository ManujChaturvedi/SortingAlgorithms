package com.company;

public class QuickSort {

    HelperFunctions helperFunctions = new HelperFunctions();

    public int partition(int[] arr,int start,int end){
        int temp = arr[end];
        int i=-1;
        for(int j=0;j<end;j++){
            if (arr[j]<temp){
                i++;
                helperFunctions.swap(arr,i,j);
            }
        }
        helperFunctions.swap(arr,i+1,end);
        return (i+1);
    }

    public void sort(int[] arr,int start,int end){
        if(end-start<2) return;
        int pivot = partition(arr,start,end);
        sort(arr,start,pivot-1);
        sort(arr,pivot+1,end);
    }

}
