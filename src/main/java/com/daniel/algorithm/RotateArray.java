package com.daniel.algorithm;

import java.util.Arrays;

/**
 * @author : danielNie
 * @Description : 轮转数组
 * @PackageName : com.daniel.algorithm
 * @ClassName : RotateArray
 * @addTime : 2021/11/27 14:18
 */
public class RotateArray {

    /**
     * https://leetcode-cn.com/problems/rotate-array/
     */
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        inverse(nums, 0, nums.length - 1);
        inverse(nums, 0, k - 1);
        inverse(nums, k, nums.length - 1);

    }

    private static void inverse(int[] nums, int i, int j) {
        while (i < j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {-1, 10, 45, 10, 6};
        int k = 3;
        rotate(numbers, k);
        System.out.println(Arrays.toString(numbers));
    }
}
