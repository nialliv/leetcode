package ru.artemev.leetcode.tasks.structures;

import org.springframework.stereotype.Component;
import ru.artemev.leetcode.tasks.helpers.ListNode;

@Component
public class MergeToLists {

    public static ListNode mergeToLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode result = new ListNode();
        ListNode pointer = result;

        do {
            pointer = setNextNodes(list1, list2, pointer);
            if (list1 != null) {
                list1 = list1.next;
            }
            if (list2 != null) {
                list2 = list2.next;
            }
        } while (list1 != null || list2 != null);

        return result;
    }

    private static ListNode setNextNodes(ListNode list1, ListNode list2, ListNode pointer) {
//        if (list1 == null) {
//            pointer.val = list2.val;
//            if (list2.next == null) {
//                pointer.next = null;
//            }
//            pointer = pointer.next;
//            return pointer;
//        }
//
//        if (list2 == null) {
//            pointer.val = list1.val;
//            if (list1.next == null) {
//                pointer.next = null;
//            }
//            pointer = pointer.next;
//            return pointer;
//        }

        if (list1.val > list2.val) {
            pointer.val = list2.val;
            pointer.next = new ListNode(list1.val, new ListNode());
        } else {
            pointer.val = list1.val;
            pointer.next = new ListNode(list2.val, new ListNode());
        }

        if(list1.next == null && list2.next == null) {
            pointer.next.next = null;
        }

        return pointer.next.next;
    }

    public static  ListNode mergeToLists_NotMy(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 == null ? list2 : list1;

        return preHead.next;
    }
}
