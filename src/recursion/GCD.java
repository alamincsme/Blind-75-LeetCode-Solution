package recursion;

public class GCD {
    public static void main(String[] args) {
        System.out.println(findGCD(0, 44));
    }

    public static int  findGCD(int a , int b) {
        if (b == 0 ) return  a;
        return findGCD(b , a %  b) ;

    }


}
//        while (b != 0) {
//            int temp = b ;
//            b = a % b ;
//            a = temp;
//        }
//         return a ;