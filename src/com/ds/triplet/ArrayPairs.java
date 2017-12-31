package com.ds.triplet;

import java.util.Scanner;



public class ArrayPairs {
   
    private static int nextPowerOf2(int num){
        if(num ==0){
            return 1;
        }
        if(num > 0 && (num & (num-1)) == 0){
            return num;
        }
        while((num & (num-1)) > 0){
            num = num & (num-1);
        }
        return num<<1;
    }
    public static long[] createSegmentTree(long input[]){
        int nextPowOfTwo = nextPowerOf2(input.length);
        long segmentTree[] = new long[nextPowOfTwo*2 -1];
        
        for(int i=0; i < segmentTree.length; i++){
            segmentTree[i] = Integer.MIN_VALUE;
        }
        constructMaxSegmentTree(segmentTree, input, 0, input.length - 1, 0);
        return segmentTree;
        
    }

    private static void constructMaxSegmentTree(long segmentTree[], long input[], int low, int high,int pos){
        if(low == high){
            segmentTree[pos] = input[low];
            return;
        }
        int mid = (low + high)/2;
        constructMaxSegmentTree(segmentTree, input, low, mid, 2 * pos + 1);
        constructMaxSegmentTree(segmentTree, input, mid + 1, high, 2 * pos + 2);
        segmentTree[pos] = Math.max(segmentTree[2*pos+1], segmentTree[2*pos+2]);
    }
    
    public static long rangeMaximumQuery(long []segmentTree,int qlow,int qhigh,int len){
        return rangeMaximumQuery(segmentTree,0,len-1,qlow,qhigh,0);
    }

    
    private static long rangeMaximumQuery(long segmentTree[],int low,int high,int qlow,int qhigh,int pos){
        if(qlow <= low && qhigh >= high){
            return segmentTree[pos];
        }
        if(qlow > high || qhigh < low){
            return Integer.MIN_VALUE;
        }
        else{
        int mid = (low+high)/2;
        return Math.max(rangeMaximumQuery(segmentTree, low, mid, qlow, qhigh, 2 * pos + 1),
                rangeMaximumQuery(segmentTree, mid + 1, high, qlow, qhigh, 2 * pos + 2));
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        long segTree[] = createSegmentTree(arr);
        long count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            	
            	long max=rangeMaximumQuery(segTree,i,j,arr.length);
            	
                if((arr[i]*arr[j])<=max)
                {
                    count++;
                  
                }
            }
        }
        System.out.println(count);
        in.close();
    }
}