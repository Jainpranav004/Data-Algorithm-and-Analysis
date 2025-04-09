package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3,9,7};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void insertion(int[]arr){
           for(int i = 1 ; i < arr.length; i++){    //start form 1
               for(int j = i ; j > 0 ; j--){
                     if(arr[j] < arr[j-1]){
                         swap(arr, j , j-1);
                     }else{
                         break;
                     }
               }
           }
    }

    public static void swap(int[]arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
 }
