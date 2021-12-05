package com.daniel.algorithm.common;

/**
 * @author Admin
 * @date 2021/12/5 22:26
 * @description algorithm
 * @className Node.java
 * @motto Talk is cheap. Show me the code.
 */
public class Node {

    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

}
