package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.MergeTwoSortedLists.mergeTwoLists;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsTest {

    @Test
    void shouldMergeTwoSortedListsCorrectly() {
        //Given
        var list1 = ListNode.of(1, 2, 4);
        var list2 = ListNode.of(1, 3, 4);
        var expected = ListNode.of(1, 1, 2, 3, 4, 4);

        //When
        var actual = mergeTwoLists(list1, list2);

        //Then
        assertEquals(expected, actual);
    }
}