public class Dated_25_03 {

    //Optimised approach
    public static int FindLCM(int a , int b){
        int greater = Math.max(a,b);
        int smaller = Math.min(a,b);
        for(int i = greater ; ; i = i + greater){
            if(i % smaller == 0){
                return i ;
            }
        }
    }
    public static int FindGCD(int a, int b){
        int result = Math.min(a,b);
        while(result > 0){
            if( a% result == 0 &&  b % result  == 0){
                break;
            }
            result--;
        }
        return result;
    }

    //APPROACH 2 - running the while loop till infinity
    public static int FindLCM2(int a, int b){
        int result = Math.max(a,b);
        while(true){
            if(result % a == 0 &&  result % b == 0){
                return result;
            }
            result++;
        }
    }

    //APproach3 - optimised uing formula
    public static int FindLCM3(int a , int b){
        int ans = (a*b) / FindGCD(a,b) ;
        return ans;
    }

    public static boolean CheckPrime(int a){
        if(a == 1){
            return false;
        }
        for(int i = 2 ; i < Math.sqrt(a) ; i++){
            if(a % i == 0 ){
                return false;
            }
        }
        return true;
    }

    //Optimised way
    public static boolean CheckPrime2(int n){
        if(n <=  1 ) return false;
        if(n <= 5 ) return true;
        for(int i = 5 ; i< Math.sqrt(n) ; i = i+6) {
            if (n % i == 0 && n % (i+6) == 0) {
                return false;
            }
        }
        return true;
    }

    //Print Prime nos
    public static void PrintPrime(int n){
        while(n % 2 == 0 ){
            System.out.println(2+" ");
            n /= 2;
        }
        for(int i = 3 ; i <=Math.sqrt(n) ; i += 2){
            while(n%i == 0 ){
                System.out.print(i + " ");
                n /= i;
            }
        }
        if(n> 2 ){
            System.out.println(n);
        }
    }


    public static void main(String[] args){
        //System.out.println(FindLCM2(3,4));
//        System.out.println(FindGCD(3,4));
//        System.out.println(FindLCM3(3,4));
//        System.out.println(CheckPrime(4));
//        System.out.println(CheckPrime2(4));
        PrintPrime(12);
    }
}
