package String;


//solution 1
public class ShortestPalindrome {
    public static   String shortestPalindrome(String s) {
        final String t = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < t.length(); ++i){
            if (s.startsWith(t.substring(i)))
                return t.substring(0, i) + s;
       }
        return t + s;
    }

    public static void main(String[] args) {
        String ans = shortestPalindrome("adam");
        System.out.println(ans);
    }
}

//solution 2
//class Solution {
//    public String shortestPalindrome(String s) {
//        int j = 0;
//        for (int i = s.length() - 1; i >= 0; i--)
//        {
//            if (s.charAt(i) == s.charAt(j)) { j += 1;
//            }
//        }
//
//        if (j == s.length())
//        {
//            return s;
//        }
//        String suffix = s.substring(j);
//        return new StringBuffer(suffix).reverse().toString() + shortestPalindrome(s.substring(0, j)) + suffix;
//    }
//}

//solution 3
//class Solution {
//    public String shortestPalindrome(String s) {
//        int i = 0;
//        int j = s.length() - 1;
//
//        while (j >= 0) {
//            if (s.charAt(i) == s.charAt(j)) {
//                i++;
//            }
//            j--;
//        }
//
//        if (i == s.length())
//            return s;
//
//        String suffix = s.substring(i);
//        String prefix = new StringBuilder(suffix).reverse().toString();
//        String mid = shortestPalindrome(s.substring(0, i));
//        return prefix + mid + suffix;
//    }
//}