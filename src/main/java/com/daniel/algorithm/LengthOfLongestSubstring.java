package com.daniel.algorithm;

/**
 * @author Administrator
 * @date 2021/12/3 10:49
 * @description 无重复字符的最长子串
 * @className LengthOfLongestSubstring.java
 * @motto Talk is cheap. Show me the code.
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    /**
     * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     *
     * @param s
     *
     * @return
     */

    public static int lengthOfLongestSubstring(String s) {
        int[] rec = new int[128];
        int len=0;
        int a = s.length();
        int start = 0;
        for(int i=0;i<rec.length;i++){
            rec[i] = -1;
        }
        for(int i=0;i<a;i++){
            int c = s.charAt(i);
            start = Math.max(start,rec[c] + 1);
            len = Math.max(len,i-start+1);
            rec[c] = i;
        }
        return len;
    }

}
