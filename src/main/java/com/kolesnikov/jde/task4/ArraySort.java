package com.kolesnikov.jde.task4;

import java.util.Arrays;

public class ArraySort {

    public int[] sortOdd(int[] src) {
        int k = 0;
        for (int i = 0; i < src.length; i++) {
            if (src[i] % 2 != 0) {
                k++;
            }
        }
        int[] semiRes = new int[k];
        k = 0;
        for (int i = 0; i < src.length; i++) {
            if (src[i] % 2 != 0) {
                semiRes[k] = src[i];
                k++;
            }
        }
        Arrays.sort(semiRes);
        k = 0;
        for (int i = 0; i < src.length; i++) {
            if (src[i] % 2 != 0) {
                src[i] = semiRes[k];
                k++;
            }
        }
        return src;
    }
    // on^3 наверное многовато для такой задачи но такое решение выглядит как
    // макимально удобное для дебага и потребляет не так много, как если
    // бы делал через вайл
}
