package ru.artemev.leetcode.tasks.arrays;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class MinimumCommonValue {

    /*
    Given two integer arrays nums1 and nums2, sorted in non-decreasing order,
    return the minimum integer common to both arrays. If there is no common
    integer amongst nums1 and nums2, return -1.

    Note that an integer is said to be common to nums1 and nums2 if both arrays
    have at least one occurrence of that integer.
     */

    // Good solution
    public int getCommon(int[] nums1, int[] nums2) {
        int i, j;
        i = 0;
        j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return -1;
    }

    //my solution
    public int myGetCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                return num;
            }
        }
        return -1;
    }
}
