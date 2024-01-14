package ru.artemev.leetcode.tasks;

import ru.artemev.leetcode.tasks.helpers.ListNode;

public class ListNodeSum {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        int tmpVal;
        while (l1 != null || l2 != null) {
            if(l1 != null && l2 != null) {
                tmpVal = l1.val + l2.val + tmp.val;
                if(tmpVal >= 10 ) {
                    tmp.val = tmpVal % 10;
                    tmp.next = new ListNode(1);
                } else {
                    tmp.val = tmpVal;
                    if(l1.next != null || l2.next != null) {
                        tmp.next = new ListNode();
                    }
                }
                tmp = tmp.next;
                l2 = l2.next;
                l1 = l1.next;
            } else if(l1 != null){
                tmpVal = l1.val + tmp.val;
                if(tmpVal >= 10 ) {
                    tmp.val = tmpVal % 10;
                    tmp.next = new ListNode(1);
                } else {
                    tmp.val = tmpVal;
                    if(l1.next != null) {
                        tmp.next = new ListNode();
                    }
                }
                l1 = l1.next;
                tmp = tmp.next;
            } else {
                tmpVal = l2.val + tmp.val;
                if(tmpVal >= 10 ) {
                    tmp.val = tmpVal % 10;
                    tmp.next = new ListNode(1);
                } else {
                    tmp.val = tmpVal;
                    if(l2.next != null) {
                        tmp.next = new ListNode();
                    }
                }
                l2 = l2.next;
                tmp = tmp.next;
            }

        }
        return result;
    }
}
