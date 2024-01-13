package recursion;

public class Factorial {
    public  static void main(String[] args) {
        System.out.println(calculateFactorial(10));
    }
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1 ;
        }

        return n * calculateFactorial(n - 1);
    }
}
