public class Searching {

    //Binary search : O(logn) with base 2
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,4};
        System.out.println(binarySearch(arr,8));

    }
    public static int binarySearch(int[]arr , int target){
        int s = 0;
        int e = arr.length-1;

        while(s <= e){
            int mid = (s + (e-s)/2);

            if(target < arr[mid]){
                e = mid -1;
            }
            else if(target > arr[mid]){
                s = mid+1;
            }
            else{
                return  mid;
            }
        }
        return -1;
    }


}


