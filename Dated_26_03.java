import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

//Home work LC : 125 , 258

public class Dated_26_03 {
    public static void main(String[] args) {
//        REC1(3);
//        PrintNto1(10);
//          Print1toN(10);
//        System.out.println(SumOfNaturalNos(5));

//        String str = "aba";
//        boolean result = CheckPalindrome(str, 0 , str.length()-1);
//        if(result){
//            System.out.println("It is a palindrome");
//        }else{
//            System.out.println("Not a palindrome");
//        }
//        IsPalindrome("aba");


        System.out.println(SumOfDigits(123));

    }

    public static int SumOfDigits(int n){
        if(n== 0 ){
            return 0 ;
        }
        return (n%10) + SumOfDigits(n/10);
    }

    public static void REC1(int n ){
        if(n==0 ){
            return;
        }
        REC1(n-1);
        System.out.println(n);
        REC1(n-1);
    }

    public static void PrintNto1(int n){
        if(n == 0 ){
            return ;
        }
        System.out.println(n);
        PrintNto1(n-1);
    }

    public static void Print1toN(int n){
        if(n == 0 ){
            return;
        }
        Print1toN(n-1);
        System.out.println(n);
    }

    public static int SumOfNaturalNos(int n){
        int sum = 0;
        if(n ==0){
            return 0;
        }
        return n + SumOfNaturalNos(n-1);
    }

    public static boolean CheckPalindrome(String str, int i , int j){
         if (i >= j) {
             return true;
        } else if( str.charAt(i) != str.charAt(j)){
             return false;
         }
         return CheckPalindrome(str , i+1 , j-1);
    }

    //APPROACH 2
    public static boolean IsPalindrome(String s){
        int i = 0 ;
        int j = s.length() -1;
        boolean result = helper(s, i ,j );
        System.out.println("Is palindrome : "+ result);
        return result;
    }

    public static boolean helper(String str , int i , int  j){
        if(i > j){
            return true;
        }
        return (str.charAt(i) == str.charAt(j) && helper(str, i+1, j-1));
    }


}
