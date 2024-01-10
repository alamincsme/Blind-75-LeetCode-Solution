package arra;

public class MaximumSubarray {
    public static int maxSubarray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int n = arr.length;

        for (int i = 0 ; i < n; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i] ;
            }

            currentSum = arr[i];

            for (int j = i + 1; j < n; j++) {
                currentSum += arr[j] ;
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum ;
    }


    public static void main(String[] args) {
        int ans = maxSubarray(new  int[] {-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(ans);
    }
}
