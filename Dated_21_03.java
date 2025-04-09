import java.sql.SQLOutput;

public class Dated_21_03 {
    public static void main(String[] args) {
//        int a = 123;
//        int count = 0 ;
//        System.out.println(PrintCount(a,count));

//        int num1 = 1234;
//        System.out.println("Is palindrome : " + isPalindrome(num1));

//        System.out.println("Factorial of num is :" + FactorialIterative(4));

        System.out.println(FindGCD(3,4));

    }


    public static int PrintCount(int n){
        int count = 0;
        if(n == 0){
            return 0;
        }
        return PrintCount(n/10) + 1;
    }

    public static boolean isPalindrome(int num1) {
        return num1 == reverse(num1);
    }

    // Correct reverse function
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int lastDig = n % 10;
            rev = rev *  10 + lastDig;
            n /= 10;    //Removes the last digit
        }
        return rev;
    }

    public static int Factorial(int num){
        if(num == 0 || num ==1 ){
            return 1;
        }
        return num* Factorial(num-1);
    }
    public static int FactorialIterative(int num){
         int ans = 1;
         for (int i = 2; i<num ;i++){
             ans *= i;
         }
         return ans;
    }

    public static int FindGCD(int num1, int num2){
        int result = Math.min(num1,num2) ;
        while(result > 0){
            if(num1 % result == 0  && num2 % result == 0 ){
                break;
            }
            result--;
        }
        return result;
    }

    public static void EuclideanAlgo(){
        //gcd(a,b) = gcd(b-a , b)  ; if b>a

    }

}
