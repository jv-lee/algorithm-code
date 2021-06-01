package jv.lee.algorithm.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jv.lee
 * @date 2019/9/18.
 * @description 算法题：两数之和
 */
public class AlgorithmTest1 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 7, 9, 5, 6, 53, 8, 9, 10};
        int target = 14;

        Solution solution1 = new Solution1();
        Solution solution2 = new Solution2();
        Solution solution3 = new Solution3();

        print(solution1.twoSum(nums, target));
        print(solution2.twoSum(nums, target));
        print(solution3.twoSum(nums, target));
    }

    private static void print(int[] result) {
        System.out.print("\nresult:");
        for (int i = 0; i < result.length; i++) {
            System.out.print("num:" + result[i] + "  ");
        }

        System.out.println("next Solution ___ ");
    }

    private interface Solution {
        int[] twoSum(int[] nums, int target);
    }

    /**
     * 方法一：暴力解法
     */
    private static class Solution1 implements Solution {

        @Override
        public int[] twoSum(int[] nums, int target) {
            System.out.println("target:" + target);
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    System.out.print("(j=" + nums[j] + ",i=" + nums[i] + ") ");
                    if (nums[j] == target - nums[i]) {
                        return new int[]{nums[i], nums[j]};
                    }
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }

    }

    /**
     * 方法二：两遍哈希表
     */
    private static class Solution2 implements Solution {

        @Override
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                //map.get(complement) != i 避免是本身
                if (map.containsKey(complement) && map.get(complement) != i) {
                    return new int[]{nums[i], map.get(complement)};
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }

    /**
     * 方法三：一遍哈希表
     */
    private static class Solution3 implements Solution {

        @Override
        public int[] twoSum(int[] nums, int target) {


            return new int[0];
        }
    }

}
