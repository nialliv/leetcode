package ru.artemev.leetcode.tasks.algorithms;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContainerWithMostWater {

    public int maxArea(int[] height) {


        List<Integer> integers = List.of(1, 2, 3);

        List<Integer> list = new ArrayList<>(integers.stream()
                .filter(a -> true)
                .toList());

        list.addAll(List.of(5, 6, 7));


        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int tmp = Math.min(height[left], height[right]) * (right - left);
            if (max < tmp) max = tmp;

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.gc();
        return max;
    }
}
