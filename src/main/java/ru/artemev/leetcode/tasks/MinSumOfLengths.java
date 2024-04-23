package ru.artemev.leetcode.tasks;

import org.springframework.stereotype.Component;

@Component
public class MinSumOfLengths {
  public int minSumOfLengths(int[] arr, int target) {
    int[] lengthSubArrays = new int[arr.length];
    int index = 0;
    int sum = 0;
    int lengthSubArray = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        lengthSubArrays[index++] = 1;
        lengthSubArray = 0;
        sum = 0;
      }
      if (sum == target) {
        lengthSubArrays[index++] = lengthSubArray;
        lengthSubArray = 0;
        sum = 0;
      }
      if (sum < target) {
        lengthSubArray++;
        sum += arr[i];
      }
      if (sum > target) {
        lengthSubArray--;
        sum = 0;
        lengthSubArrays[index++] = lengthSubArray;
      }
    }
    return getCountWithMinLength(lengthSubArrays);
  }

  private int getCountWithMinLength(int[] lengthSubArrays) {
    if (lengthSubArrays.length < 2) {
      return -1;
    }
    int minimalLength = lengthSubArrays[0];
    int count = 0;
    for (int i = 1; i < lengthSubArrays.length; i++) {
      minimalLength = Math.min(minimalLength, lengthSubArrays[i]);
    }

    for (int i : lengthSubArrays) {
      if (i == minimalLength) {
        count++;
      }
    }
    return count;
  }
}
