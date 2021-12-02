package com.daniel.algorithm;


/**
 * @author : danielNie
 * @Description :  搜索插入位置
 * @PackageName : com.daniel.algorithm
 * @ClassName : SearchInsert
 * @addTime : 2021/11/27 11:03
 */
public class SearchInsert {

    /**
     * https://leetcode-cn.com/problems/search-insert-position/
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1, ans = nums.length;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6};
        int target = 6;
        int i = searchInsert(numbers, target);
        System.out.println(i);
    }

}
