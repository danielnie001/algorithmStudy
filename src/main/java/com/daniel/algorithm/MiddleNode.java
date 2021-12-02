package com.daniel.algorithm;

import com.daniel.algorithm.common.ListNode;

/**
 * @author : danielNie
 * @Description :  链表的中间结点
 * @PackageName : com.daniel.algorithm
 * @ClassName : MiddleNode
 * @addTime : 2021/11/28 9:59
 */
public class MiddleNode {
    /**
     * https://leetcode-cn.com/problems/middle-of-the-linked-list/
     */
    public static ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.getListNode(head, 2);
        ListNode listNode = middleNode(head);
        System.out.println(listNode);
    }

}
