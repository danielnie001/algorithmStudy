package com.daniel.algorithm;

import com.daniel.algorithm.common.ListNode;

/**
 * @author : danielNie
 * @Description : 删除链表的倒数第 N 个结点
 * @PackageName : com.daniel.algorithm
 * @ClassName : RemoveNthFromEnd
 * @addTime : 2021/11/28 11:27
 */
public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode pre = head;
        ListNode next = head;
        while (next.next != null) {
            next = next.next;
            length++;
        }
        int idx = length - n;
        if (idx < 0) {
            head = head.next;
        }
        while (idx > 0) {
            pre = pre.next;
            idx--;
        }
        if (pre.next == null || pre.next.next == null) {
            pre.next = null;
        } else {
            pre.next = pre.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        head.getListNode(head,2);
        ListNode listNode = removeNthFromEnd(head, 1);
        System.out.println(listNode);
    }
}
