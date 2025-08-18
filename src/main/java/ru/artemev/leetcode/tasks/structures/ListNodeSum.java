package ru.artemev.leetcode.tasks.structures;

import ru.artemev.leetcode.tasks.helpers.ListNode;

public class ListNodeSum {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;
        int tmpVal = 0;
        int firstVal = l1.val + l2.val;
        if(firstVal > 9 ) {
            result.val = firstVal % 10;
            tmpVal = 1;
        } else {
            result.val = firstVal;
        }
        ListNode pointerResult = result;
        while (pointer1.next != null || pointer2.next != null) {
            pointerResult.next = new ListNode();
            if (pointer1.next == null) {
                int val = pointer2.next.val + tmpVal;
                if (val > 9) {
                    pointerResult.next.val = val % 10;
                    tmpVal = 1;
                } else {
                    pointerResult.next.val = val;
                    tmpVal = 0;
                }
                pointer2 = pointer2.next;
                pointerResult = pointerResult.next;
                continue;
            }
            if (pointer2.next == null) {
                int val = pointer1.next.val + tmpVal;
                if (val > 9) {
                    pointerResult.next.val = val % 10;
                    tmpVal = 1;
                } else {
                    pointerResult.next.val = val;
                    tmpVal = 0;
                }
                pointer1 = pointer1.next;
                pointerResult = pointerResult.next;
                continue;
            }
            int val = pointer1.next.val + pointer2.next.val + tmpVal;
            if (val > 9) {
                pointerResult.next.val = val % 10;
                tmpVal = 1;
            } else {
                pointerResult.next.val = val;
                tmpVal = 0;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
            pointerResult = pointerResult.next;
        }
        if(tmpVal > 0) {
            pointerResult.next = new ListNode(1);
        }
        return result;
    }
}
