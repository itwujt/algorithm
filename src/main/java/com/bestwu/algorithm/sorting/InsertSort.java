package com.bestwu.algorithm.sorting;

/**
 * 插入排序 <br>
 * 插入排序的工作原理是通过构建有序序列，对未排序的数据，在已排序序列中从后向前扫描
 * 找到相应位置并插入。
 *
 * 从第一个元素开始，该元素可以认为已经被排序
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置
 * 时间复杂度 O(n^2)
 * @author Best Wu
 * @date 2021/1/17 9:38 <br>
 */
public class InsertSort {

    private final static int[] TEST_ARRAY = {11, 5, 54, 2, 0, 0, 100, 36, 24, 64};

    private static void sort(int[] arr) {
        int size = arr.length;
        // 从第二个元素开始，第一个元素认为它是有序的
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        InsertSort.sort(TEST_ARRAY);
        for (int i : TEST_ARRAY) {
            System.out.print(i + "  ");
        }
    }
}
