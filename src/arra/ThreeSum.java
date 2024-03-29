package arra;

import java.util.*;


//time complexity o(n^2)
public class ThreeSum {

    public static void main(String[] args) {
        int[] arr =  {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }
}

//time complexity o(n^3)
//public static List<List<Integer>> threeSum(int[] nums) {
//    List<List<Integer>> result = new ArrayList<>();
//    Set<List<Integer>> resultSet = new HashSet<>();
//
//    Arrays.sort(nums);
//
//    for (int i = 0; i < nums.length - 2; i++) {
//        for (int j = i + 1; j < nums.length - 1; j++) {
//            for (int k = j + 1; k < nums.length; k++) {
//                if (nums[i] + nums[j] + nums[k] == 0) {
//                    List<Integer> l = Arrays.asList(nums[i], nums[j], nums[k]);
//                    resultSet.add(l);
//                }
//            }
//        }
//    }
//    result.addAll(resultSet);
//    return result ;
//}