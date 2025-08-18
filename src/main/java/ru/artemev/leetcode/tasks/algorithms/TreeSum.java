package ru.artemev.leetcode.tasks.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeSum {
    public static List<List<Integer>> treeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return ans;
    }

    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        int res = 0;

        if (nums.length == 3) {
            return Arrays.stream(nums).sum();
        }

        for (int p1 = 0; p1 < n - 2; p1++) {
            for (int p2 = p1 + 1; p2 < n - 1; p2++) {
                for (int p3 = p2 + 1; p3 < n; p3++) {
                    int currSum = nums[p1] + nums[p2] + nums[p3];

                    int currDiff = Math.abs(currSum - target);

                    if (currDiff < minDiff) {
                        res = currSum;
                        minDiff = currDiff;
                    } else if (currDiff == minDiff) {
                        res = Math.max(res, currSum);
                    }
                }
            }
        }

        return res;
    }
}
