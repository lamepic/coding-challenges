package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void merge1() {
        int[] expected = {1,2,2,3,5,6};
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        MergeSortedArray.merge(nums1, 3, nums2, 3);

        assertArrayEquals(expected, nums1);
    }

    @Test
    void merge2() {
        int[] expected = {1};
        int[] nums1 = {1};
        int[] nums2 = {};

        MergeSortedArray.merge(nums1, 1, nums2, 0);

        assertArrayEquals(expected, nums1);
    }
    @Test
    void merge3() {
        int[] expected = {1};
        int[] nums1 = {0};
        int[] nums2 = {1};

        MergeSortedArray.merge(nums1, 0, nums2, 1);

        assertArrayEquals(expected, nums1);
    }
}