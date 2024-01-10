package arra;

public class TwoSum {
    public static void main(String[] args) {
        int [] ans = twoSum(new int [] {2,7,11,15}, 9);
        for (int an : ans) {
            System.out.println(an);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int arr_len = nums.length;
        for (int i = 0 ; i < arr_len; ++i) {
            for (int j = i + 1; j < arr_len; j++) {
                if (nums[i] + nums [j] == target) {
                    return  new int[] {i , j} ;
                }
            }
        }
        return new int [] {};
    }
}
