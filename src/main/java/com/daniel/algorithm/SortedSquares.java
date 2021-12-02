package com.daniel.algorithm;

import java.util.Arrays;

/**
 * @author : danielNie
 * @Description : 有序数组的平方
 * @PackageName : com.daniel.algorithm
 * @ClassName : SortedSquares
 * @addTime : 2021/11/27 13:00
 */
public class SortedSquares {

    /**
     * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
     */
    public static int[] sortedSquares(int[] nums) {
        int negative = -1;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negative = i;
            } else {
                break;
            }
        }
        int[] ans = new int[n];
        int index = 0, i = negative, j = negative + 1;
        while (i >= 0 || j < n) {
            if (i == -1) {
                ans[index] = nums[j] * nums[j];
                j++;
            } else if (j == n) {
                ans[index] = nums[i] * nums[i];
                i--;
            } else if (nums[i] * nums[i] >= nums[j] * nums[j]) {
                ans[index] = nums[j] * nums[j];
                j++;
            } else {
                ans[index] = nums[i] * nums[i];
                i--;
            }
            ++index;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] numbers = {-5, -3, -1, 0, 1, 3, 4};
        int[] ints = sortedSquares(numbers);
        System.out.println(Arrays.toString(ints));
    }
}
