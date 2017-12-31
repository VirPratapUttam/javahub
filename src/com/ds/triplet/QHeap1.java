package com.ds.triplet;
import java.io.*;
import java.util.*;

class MinHeap
{
       public void sort(int arr[]){
        for(int i=1; i < arr.length; i++){
            heapAdd(arr, i);
        }
        
        for(int i = arr.length-1; i > 0 ; i--){
            if(arr[i]>Integer.MIN_VALUE)
                swap(arr, 0, i);
            heapify(arr, i-1);
        }
    }
    public int find(int arr[],int data){
        for(int i=0; i < arr.length; i++){
            if(data==arr[i])
                return i;
        }
        return -1;
    }
    
    private void heapify(int arr[], int end){
        int i = 0;
        int leftIndex;
        int rightIndex;
        while(i <= end){
            leftIndex = 2*i + 1;
            if(leftIndex > end){
                break;
            }
            rightIndex = 2*i + 2;
            if(rightIndex > end){
                rightIndex = leftIndex;
            }
            if(arr[i]  >= Math.max(arr[leftIndex], arr[rightIndex])){
                break;
            }
            if(arr[leftIndex] >= arr[rightIndex]){
                swap(arr, i, leftIndex);
                i = leftIndex;
            }else{
                swap(arr, i, rightIndex);
                i = rightIndex;
            }
        }
    }
    
    private void swap(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    private void heapAdd(int arr[], int end){
        int i = end;
        while(i > 0){
            if(arr[i] > arr[(i-1)/2]){
                swap(arr, i, (i-1)/2);
                i = (i - 1)/2;
            }else{
                break;
            }
        }
    }
}

public class QHeap1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
         MinHeap minHeap = new MinHeap();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=Integer.MIN_VALUE;
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            int command=sc.nextInt();
            switch(command)
            {
                case 1:
                    int element1=sc.nextInt();
                    arr[j]=element1;
                    j++;
                    minHeap.sort(arr);
                    break;
                case 2:
                    int element2=sc.nextInt();
                    int index=minHeap.find(arr,element2);
                    if(index>=0)
                    {
                    arr[index]=Integer.MIN_VALUE;
                    j--;
                     minHeap.sort(arr);
                    }
                    break;
                case 3:
                    System.out.println(arr[0]);
                    break;
            }
        }
        
    }
}
