package com.daniel.algorithm;

import com.daniel.algorithm.common.TreeNode;

/**
 * @author Admin
 * @date 2021/12/4 21:31
 * @description 合并二叉树
 * @className MergeTrees.java
 * @motto Talk is cheap. Show me the code.
 */
public class MergeTrees {

    /**
     * https://leetcode-cn.com/problems/merge-two-binary-trees/
     */

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root2.right, root2.right);
        return root1;
    }

    public static void main(String[] args) {

    }

}
