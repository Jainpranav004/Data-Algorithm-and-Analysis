package Sorting;

import java.util.Arrays;

//Put elements at the correct index

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5,6};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selection(int[] arr){
         for(int i = 0 ;i <arr.length -1 ; i++){
             int last = arr.length - i - 1;
             int max_index = getMaxIndex(arr,0 , last);
             swap(arr, max_index, last);
         }
    }

    public static void swap(int[]arr , int first  , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMaxIndex(int[]arr , int start , int end){
          int max = start;
          for(int i = start ; i <= end ; i++){
                if(arr[max] < arr[i]){
                    max = i;
                }
        }
          return max;
    }
}
