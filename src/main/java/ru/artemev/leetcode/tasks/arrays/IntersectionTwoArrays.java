package ru.artemev.leetcode.tasks.arrays;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class IntersectionTwoArrays {

    public int[] solution(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int j : nums2) {
            if (set1.contains(j)) {
                set2.add(j);
            }
        }

        int[] answer = new int[set2.size()];
        int index = 0;
        for (int value : set2) {
            answer[index++] = value;
        }
        return answer;
    }

}
