package ru.artemev.leetcode.tasks.structures;

import org.junit.jupiter.api.Test;
import ru.artemev.leetcode.tasks.helpers.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListNodeSumTest {

    @Test
    void addTwoNumbers_test1() {
        ListNode expected = buildList(new int[]{7, 0, 8});
        ListNode actual = ListNodeSum.addTwoNumbers(buildList(new int[]{2, 4, 3}), buildList(new int[]{5, 6, 4}));
        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbers_test2() {
        ListNode l1 = new ListNode(0);
        ListNode expected = new ListNode(0);
        assertEquals(expected, ListNodeSum.addTwoNumbers(l1, l1));
    }

    @Test
    void addTwoNumbers_test3() {
        ListNode l1 = buildList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = buildList(new int[]{9, 9, 9, 9});
        ListNode expected = buildList(new int[]{8, 9, 9, 9, 0, 0, 0, 1});
        assertEquals(expected, ListNodeSum.addTwoNumbers(l1, l2));
    }

    private ListNode buildList(int[] nums) {
        ListNode result = new ListNode();
        ListNode pRes = result;
        pRes.val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pRes.next = new ListNode(nums[i]);
            pRes = pRes.next;
        }
        return result;
    }
}