package com.daniel.algorithm;

/**
 * @author : danielNie
 * @Description : 二分法查找
 * @PackageName : com.daniel.algorithm
 * @ClassName : BinarySearch
 * @addTime : 2021/11/27 10:13
 *
 */
public class BinarySearch {
    /**
     * https://leetcode-cn.com/problems/binary-search/
     */
    public static int search(int[] nums, int target) {
        int low = 0,high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {-1,0,1,4,5,7,8};
        int target = 7;
        int search = search(numbers, target);
        System.out.println(search);
    }
}
