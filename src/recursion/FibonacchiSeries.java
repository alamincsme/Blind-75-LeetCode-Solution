package recursion;

public class FibonacchiSeries {
    public  static void main(String[] args) {
        for (int i = 0 ; i <= 10 ; ++i) {
            System.out.print(calculateFibonacchi(i) + " ");
        }
    }

    public static int calculateFibonacchi(int n) {
        if (n <= 1 ) {
            return n;
        }

        return calculateFibonacchi(n - 1) + calculateFibonacchi(n - 2);
    }
}
