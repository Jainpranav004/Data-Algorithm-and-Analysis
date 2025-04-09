package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 6, 2, 7};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

        public static void Bubble(int[]arr){
            boolean swapped = false;
            for(int i = 0 ; i< arr.length - 1; i++) {
                swapped = false;
                for (int j = 0 ; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                if (swapped == false) {
                    break;
                }
            }
        }


}
