package com.daniel.algorithm.common;

/**
 * @author Admin
 * @date 2021/12/4 21:31
 * @description algorithm
 * @className TreeNode.java
 * @motto Talk is cheap. Show me the code.
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
