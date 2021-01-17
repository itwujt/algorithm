package com.bestwu.algorithm.sorting;

/**
 * Bubble Sort 冒泡排序 <br>
 *
 * @author Best Wu
 * @date 2021/1/16 20:33 <br>
 */
public class BubbleSort {

    private final static int[] TEST_ARRAY = {25, 32, 10, 8, 1, 20, 9, 100, 50, 67};

    private static void sort(int[] arr) {
        // 声明临时变量，用于存储临时值
        int tmp;
        // 获取数组长度
        int length = arr.length;
        // length 个数，需要比较 length - 1 次
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort.sort(TEST_ARRAY);
        for (int i : TEST_ARRAY) {
            System.out.println(i);
        }
    }
}
