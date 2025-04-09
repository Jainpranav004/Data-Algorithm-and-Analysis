public class FoundationQuestions {
    public static void main(String[] args) {
//        System.out.println(PrintCount(1111));
    IsPalindrome(121);

    }

    public static int PrintCount(int n){
        int count = 0;
        if(n == 0){
            return 0;
        }
        return PrintCount(n/10) + 1;
    }

    public static int reverse(int n ){
        int rev = 0;
        while(n > 0 ){
            int lastDig = n % 10;
            rev = rev * 10 + lastDig;
            n = n/10;
        }
        return rev;
    }
    public static void IsPalindrome (int n){
        if (n == reverse(n)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }




}
