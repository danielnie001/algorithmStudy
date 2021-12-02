package com.daniel.algorithm;

import java.util.Arrays;

/**
 * @author : danielNie
 * @Description : 两数之和 II - 输入有序数组
 * @PackageName : com.daniel.algorithm
 * @ClassName : TwoSum
 * @addTime : 2021/11/27 14:41
 */
public class TwoSum {

    /**
     * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
     */
    public static int[] twoSum(int[] numbers, int target) {
//        1、暴力破解：
//        int[] ans = new int[2];
//        for (int i1 = 0; i1 < numbers.length; i1++) {
//            int j = i1 +1;
//            while (j<numbers.length){
//                if(numbers[i1] + numbers[j] == target){
//                    ans[0] = i1+1;
//                    ans[1] = j+1;
//                    return ans;
//                }
//                j++;
//            }
//        }
//        return ans;
//        2、二分查找
//        for (int i = 0; i < numbers.length; i++) {
//            int low = i + 1, high = numbers.length - 1;
//            while (low <= high) {
//                int mid = (high - low) / 2 + low;
//                if (numbers[mid] == target - numbers[i]) {
//                    return new int[]{i + 1, mid + 1};
//                } else if (numbers[mid] < target - numbers[i]) {
//                    low = mid + 1;
//                } else {
//                    high = mid - 1;
//                }
//            }
//        }
//        return new int[]{-1,-1};
//        3、双指针
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int ans = numbers[l] + numbers[r];
            if (ans == target) {
                return new int[]{l + 1, r + 1};
            } else if (ans < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] ints = twoSum(numbers, target);
        System.out.println(Arrays.toString(ints));
    }
}
