package com.daniel.algorithm;

import java.util.Arrays;

/**
 * @author : danielNie
 * @Description : 移动零
 * @PackageName : com.daniel.algorithm
 * @ClassName : MoveZeroes
 * @addTime : 2021/11/27 14:25
 */
public class MoveZeroes {

    /**
     * https://leetcode-cn.com/problems/move-zeroes/
     */
    public static void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
            j++;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 0, 3, 5, 6, 3};
        moveZeroes(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
