package com.daniel.algorithm;

import com.daniel.algorithm.common.Node;

/**
 * @author Admin
 * @date 2021/12/5 22:26
 * @description algorithm
 * @className Connect.java
 * @motto Talk is cheap. Show me the code.
 */
public class Connect {

    /**
     * https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/
     */

    public static Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Node leftmost = root;
        while (leftmost.left != null) {
            Node head = leftmost;
            while (head.next != null) {
                head.left.next = head.right;
                head.right.next = head.next.left;
                head = head.next;
            }
            head.left.next = head.right;
            leftmost = leftmost.left;
        }
        return root;
    }

    public static void main(String[] args) {

    }

}
