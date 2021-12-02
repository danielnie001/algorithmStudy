package com.daniel.algorithm;

/**
 * @author : danielNie
 * @Description : 反转字符串中的单词 III
 * @PackageName : com.daniel.algorithm
 * @ClassName : ReverseWords
 * @addTime : 2021/11/27 16:12
 */
public class ReverseWords {

    /**
     * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
     *
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        StringBuilder ret = new StringBuilder();
        int i = 0;
        int length = s.length();
        while (i < length) {
            int start = i;
            while (i < length && s.charAt(i) != ' ') {
                i++;
            }
            for (int p = start; p < i; p++) {
                ret.append(s.charAt(start + i - 1 - p));
            }
            while (i < length && s.charAt(i) == ' ') {
                i++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }
}
