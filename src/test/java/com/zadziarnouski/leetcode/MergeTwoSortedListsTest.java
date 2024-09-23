package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.MergeTwoSortedLists.mergeTwoLists;
import static com.zadziarnouski.leetcode.structure.ListNode.createList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsTest {

    @Test
    void shouldMergeTwoSortedListsCorrectly() {
        //Given
        var list1 = createList(1, 2, 4);
        var list2 = createList(1, 3, 4);
        var expected = createList(1, 1, 2, 3, 4, 4);

        //When
        var actual = mergeTwoLists(list1, list2);

        //Then
        assertEquals(expected, actual);
    }
}