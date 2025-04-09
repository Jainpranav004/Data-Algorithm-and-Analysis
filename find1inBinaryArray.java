public class find1inBinaryArray {

        //Binary search : O(logn) with base 2
        public static void main(String[] args) {
            int[]arr = {0,0,0,1,1,1,1};
            int startIndex = Search1(arr, 1 , true);

            if(startIndex == -1){
                System.out.println(0);
            }else{
                System.out.println(arr.length - startIndex);
            }



        }
        public static int Search1(int[]arr , int target , boolean FirstStartindex){
            int s = 0;
            int e = arr.length-1;
            int ans = -1;

            while(s <= e){
                int mid = (s + (e-s)/2);

                if(target < arr[mid]){
                    e = mid -1;
                }
                else if(target > arr[mid]){
                    s = mid+1;
                }
                else{
                    ans = mid;
                    if(FirstStartindex){
                        e = mid -1;
                    }else{
                        s = mid + 1;
                    }
                }
            }
            return ans;
        }


    }



