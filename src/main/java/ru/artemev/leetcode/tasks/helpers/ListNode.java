package ru.artemev.leetcode.tasks.helpers;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode convert(int[] list) {
        ListNode result = new ListNode();
        ListNode pointer = result;
        for (int i = 0; i < list.length; i++) {
            pointer.val = list[i];
            if (i != list.length - 1) {
                pointer.next = new ListNode();
                pointer = pointer.next;
            }
        }
        return result;
    }


}
