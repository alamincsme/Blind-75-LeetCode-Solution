package recursion;

public class DemonstratedRecursion {
    public static int func(int n) {
        if (n == 1) {
            return 1 ;
        } else {
            return   1 + func(n - 1 );
        }
    }

    public static void main(String[] args) {
        int n = 3 ;
        System.out.println(func(n));
    }
}
