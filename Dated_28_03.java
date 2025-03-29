public class Dated_28_03 {
    public static void main(String[] args) {
//        String str = "abc";
//        printSubsets(str, 0, "");

        System.out.println(JosephProblem(5, 2));
    }

    // Method to print all possible subsets of a string
    public static void printSubsets(String str, int index, String subset) {
        if (index == str.length()) {
            System.out.println(subset);
            return;
        }

        printSubsets(str, index + 1, subset); // exclude current character
        printSubsets(str, index + 1, subset + str.charAt(index)); // include current character
    }

    public static int JosephProblem(int n, int k ){
            if (n == 1) {
                return 1;
            } else {
                int result = JosephProblem(n-1,k);
                return ( result + (k+1) ) % (n+1) ;
            }
    }