package ru.artemev.leetcode.tasks.algorithms;

import org.springframework.stereotype.Component;

@Component
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right) {
            int tmp = Math.min(height[left], height[right]) * (right - left);
            if(max < tmp) max = tmp;

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.gc();
        return max;
    }
}
