package arra;
import java.util.Arrays;
//another best solution leetcode two sum , time complexity o(nlogn)
public class TwoSum {
    public static void main(String[] args) {
        int[] ans = twoSum(new int[]{3,3,4}, 6);
        for (int an : ans) {
            System.out.println(an);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        for (int i = 0; i < sortedNums.length; i++) {
            int complement = target - sortedNums[i];
            int index = binarySearch(sortedNums, complement);

            if (index != -1 && index != i) {
                int firstIndex = indexOf(nums, sortedNums[i], -1);
                int secondIndex = indexOf(nums, complement, firstIndex);
                return new int[]{Math.min(firstIndex, secondIndex), Math.max(firstIndex, secondIndex)};
            }
        }

        return new int[]{};
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    private static int indexOf(int[] nums, int value, int excludeIndex) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value && i != excludeIndex) {
                return i;
            }
        }
        return -1;
    }
}

//time complexity o(n^2)
//class Solution {
//    public static int[] twoSum(int[] nums, int target) {
//        int arr_len = nums.length;
//        for (int i = 0 ; i < arr_len; ++i) {
//            for (int j = i + 1; j < arr_len; j++) {
//                if (nums[i] + nums [j] == target) {
//                    return  new int[] {i , j} ;
//                }
//            }
//        }
//        return new int [] {};
//    }
//}