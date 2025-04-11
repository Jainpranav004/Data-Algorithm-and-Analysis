package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
         int[]arr = { 1,3,4,5,6,3};
         Mergesort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));


    }

    public static void Mergesort(int[]arr , int st , int end){
          if(st >= end){
              return;
          }

          int mid = st+(end-st)/2;
        Mergesort(arr, st, mid);
        Mergesort(arr, mid+1 , end);

        Merger(arr, st, end, mid);

    }


    public static void Merger(int[]arr, int st, int end , int mid){
           int[] mix = new int[end-st+1];

           int i = st;
           int j = mid+1 ;
           int k = 0;

           while( i <= mid && j <= end){
               if(arr[i] < arr[j]){
                   mix[k] = arr[i];
                   k++; i++;
               }
               else{
                   mix[k] = arr[j];
                   k++; j++;
               }
           }

           while(i <= mid){
               mix[k] = arr[i];
               k++; i++;
           }
           while(j <= end ){
               mix[k] = arr[j] ;
               k++; j++;
           }

        for (int l = 0; l < mix.length; l++) {
            arr[st + l] = mix[l];
        }
    }
}
