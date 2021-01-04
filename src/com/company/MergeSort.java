package com.company;

public class MergeSort {


    private void merge(int[] arr,int start,int mid,int end){
        if (arr[mid]>arr[mid-1]) return;
        int i=start;
        int j=mid;
        int tempIndex = 0;
        int[] temp = new int[end-start];
        while (i<mid && j<end){
            temp[tempIndex++] = arr[i]<arr[j]?arr[i++]:arr[j++];
        }
        System.arraycopy(arr,i,arr,start+tempIndex,mid-i);
        System.arraycopy(temp,0,arr,start,tempIndex);
    }

    public void sort(int[] arr,int start,int end){
        if (end-start<2) return;
        int mid = (start+end)/2;
        sort(arr,start,mid);
        sort(arr,mid,end);
    }

}
