import java.util.Arrays;

public class AgressiveCows {
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        int[] arr  = {1,2,3};
        System.out.println(MaxMinDistance(n, arr, k));

    }

    public static boolean canPlaceCows(int[]arr , int k , int n , int  minDist){
         int count = 1;
         int lastPos = arr[0];

         for(int i = 1; i < n ; i++){
              if(arr[i] - lastPos >= minDist){
                  count ++ ;
                  lastPos = arr[i]; // update position
              }
              if(count == k) {
                  return true;    //all cows placed
              }
         }
         return false;
    }

    public static int MaxMinDistance(int n , int[] arr , int k){

        Arrays.sort(arr);  //sort in inc order
        int low  = 0;
        int high = arr[n-1] - arr[0];
        int result = 0;

        while(low <= high){

            int mid = (low + high) / 2;
            if(canPlaceCows(arr, k, n ,mid)){    //if we can place cow
                result = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return result;
    }
}
