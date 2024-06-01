package ru.artemev.leetcode.tasks.structures;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.artemev.leetcode.tasks.helpers.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class MergeToListsTest {

    @Test
    void checkConverter() {
        int[] arr = new int[]{1, 1, 2, 3, 4, 4};
        ListNode expected =
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(4))))));
        ListNode actual = ListNode.convert(arr);

        assertEquals(expected, actual);
    }

    @Test
    void mergeToListsTest() {
        ListNode list1 = ListNode.convert(new int[]{1,2,4});
        ListNode list2 = ListNode.convert(new int[]{1,3,4});
        ListNode expected = ListNode.convert(new int[]{1,1,2,3,4,4});
        ListNode actual = MergeToLists.mergeToLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeToLists_EmptyListTest() {
        assertNull(MergeToLists.mergeToLists(null, null));
    }

    @Test
    void mergeToLists_OneElementTest() {
        ListNode expected = new ListNode(0);
        assertEquals(expected, MergeToLists.mergeToLists(null, new ListNode(0)));
        assertEquals(expected, MergeToLists.mergeToLists(new ListNode(0), null));
    }
}