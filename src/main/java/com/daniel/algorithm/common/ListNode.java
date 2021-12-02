package com.daniel.algorithm.common;

import lombok.Data;

/**
 * @author : danielNie
 * @Description : IntelliJ IDEA
 * @PackageName : com.daniel.algorithm.common
 * @ClassName : ListNode
 * @addTime : 2021/11/28 10:00
 */
@Data
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public void getListNode(ListNode head, int idx) {
        if (idx > 5) {
            return;
        }
        head.next = new ListNode(idx);
        getListNode(head.next, ++idx);
    }
}
