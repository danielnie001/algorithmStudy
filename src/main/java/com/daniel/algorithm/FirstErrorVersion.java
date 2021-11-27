package com.daniel.algorithm;

/**
 * @author : danielNie
 * @Description : 第一个错误的版本
 * @PackageName : com.daniel.algorithm
 * @ClassName : FirsrtErrorVersion
 * @addTime : 2021/11/27 10:32
 */
public class FirstErrorVersion {

    /**
     * https://leetcode-cn.com/problems/first-bad-version/solution/
     */
    public static int firstBadVersion(int n) {
        int low = 1,high=n;
        while(low < high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)){
                high = mid;
            }else{
                low = mid +1;
            }
        }
        return low;
    }

    public static boolean isBadVersion(int n){
        return n == 3;
    }

    public static void main(String[] args) {
        int i = firstBadVersion(5);
        System.out.println(i);
    }
}
