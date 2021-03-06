package com.daniel.algorithm;

/**
 * @author Administrator
 * @date 2021/12/3 11:14
 * @description  字符串的排列
 * @className CheckInclusion.java
 * @motto Talk is cheap. Show me the code.
 */
public class CheckInclusion {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean b = checkInclusion(s1, s2);
        System.out.println(b);
    }

    /**
     * 给你两个字符串s1和s2 ，写一个函数来判断 s2 是否包含 s1的排列。如果是，返回 true ；否则，返回 false 。
     * <p>
     * 换句话说，s1 的排列之一是 s2 的 子串 。
     */
    //    方法1：
    //    public static boolean checkInclusion(String s1, String s2) {
    //        int n = s1.length(),m=s2.length();
    //        if(n>m){
    //            return false;
    //        }
    //        int[] cnt1 = new int[26];
    //        int[] cnt2 = new int[26];
    //        for (int i = 0; i < n; i++) {
    //            cnt1[s1.charAt(i) - 'a']++;
    //            cnt2[s2.charAt(i) - 'a']++;
    //        }
    //        if(Arrays.equals(cnt1,cnt2)){
    //            return true;
    //        }
    //        for (int i = n; i < m; i++) {
    //            cnt2[s2.charAt(i) - 'a']++;
    //            cnt2[s2.charAt(i-n) - 'a']--;
    //            if(Arrays.equals(cnt1,cnt2)){
    //                return true;
    //            }
    //        }
    //        return false;
    //    }
    //    方法2：
    public static boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        int index = 0;
        for (; index < n1; index++) {
            count1[c1[index] - 'a']++;
            count2[c2[index] - 'a']++;
        }
        while (index < n2) {
            if (checkNums(count1, count2)) {
                return true;
            }
            count2[c2[index] - 'a']++;
            count2[c2[index - n1] - 'a']--;
            index++;
        }
        return checkNums(count1, count2);
    }

    public static boolean checkNums(int[] count1, int[] count2) {
        int n = count1.length;
        for (int i = 0; i < n; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

}
