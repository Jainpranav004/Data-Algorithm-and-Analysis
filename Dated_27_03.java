import java.util.ArrayList;
//HOMEWORK
//subset of a string


public class Dated_27_03 {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(2);
//        arr.add(4);
//        arr.add(1);
//        FindRopePeices(arr);

        System.out.println(FindRope(5,2,4,1));

    }

    //ARRAY APPROACH

//    public static void FindRopePeices(ArrayList<Integer> arr){
//            int n = arr.size();
//
//            for (int i = 0; i < n; i++) {
//                for (int j = i; j < n; j++) {
//                    for (int k = i; k <= j; k++) {
//                        System.out.print(arr.get(k) + " ");
//                    }
//
//                    System.out.println();
//                }
//            }
//        }

    public static int FindRope(int n, int a , int b , int c){
        if(n==0){
            return 0;
        }
        if(n < 0 ){
            return -1;
        }

        int res1 = FindRope(n-a,a,b,c);
        int res2 = FindRope(n-b,a,b,c);
        int res3 = FindRope(n-c,a,b,c);

        int result = Math.max(res1, Math.max(res2, res3));

        if(result == -1){
            return -1;
        }
        return result + 1;

    }



}
