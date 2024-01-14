package ru.artemev.leetcode.tasks;

public class ProdFib {
    public static long[] productFibOld(long prod) {
        long firstFib = 0;
        long secondFib = 1;
        long tmpSumFib;
        long tmpProd = 0;
        while (tmpProd < prod) {
            tmpSumFib = firstFib + secondFib;
            firstFib = secondFib;
            secondFib = tmpSumFib;
            tmpProd = firstFib * secondFib;
        }
        return new long[]{firstFib, secondFib, tmpProd == prod ? 1 : 0};
    }

    public static long[] productFib(long prod) {
        long firstFib = 0L;
        long secondFib = 1L;
        long tmpSumFib;
        while (firstFib * secondFib < prod) {
            tmpSumFib = firstFib + secondFib;
            firstFib = secondFib;
            secondFib = tmpSumFib;
        }
        return new long[]{firstFib, secondFib, firstFib * secondFib == prod ? 1 : 0};
    }

    public static int[] getFibonacci(int end) {
        int[] result = new int[end];
        int firstFib = 0;
        int secondFib = 1;
        int tmpFib;
        for (int i = 0; i < end; i++) {
            result[i] = firstFib;
            tmpFib = firstFib + secondFib;
            firstFib = secondFib;
            secondFib = tmpFib;
        }
        return result;
    }
}
