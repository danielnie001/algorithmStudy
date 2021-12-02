package com.daniel.algorithm;

import java.util.Arrays;

/**
 * @author : danielNie
 * @Description : 反转字符串
 * @PackageName : com.daniel.algorithm
 * @ClassName : ReverseString
 * @addTime : 2021/11/27 16:05
 */
public class ReverseString {

    /**
     * https://leetcode-cn.com/problems/reverse-string/
     */
    public static void reverseString(char[] s) {
        int low = 0, high = s.length - 1;
        while (low < high) {
            char tmp = s[low];
            s[low] = s[high];
            s[high] = tmp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
}
