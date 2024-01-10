package arra;

public class RemoveDuplicates {
    public static int removeDuplicates(int[]  nums) {
        int n = nums.length;
        if (n == 0) {
            return 0 ;
        }

        int currentIndex = 1 ;
        for (int i = 1 ; i < n; ++i) {
            if (nums[i] != nums[i - 1] ) {
                nums[currentIndex] = nums[i] ;
                currentIndex = currentIndex + 1 ;
            }
        }


        return currentIndex ;
    }

    public static void main(String[] args) {
        int ans = removeDuplicates(new  int[] { 2,3, 4,4,4,7,8,8,9});
        System.out.println(ans);
    }
}
