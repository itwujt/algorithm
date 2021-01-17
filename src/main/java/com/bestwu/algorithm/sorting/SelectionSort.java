package com.bestwu.algorithm.sorting;

/**
 * 选择排序 <br>
 *
 * 在未排序序列中找到最小元素，存放到排序序列的起始位置
 * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列起始位置。
 * 以此类推，直到所有元素均排序完毕。
 *
 * @author Best Wu
 * @date 2021/1/17 14:08 <br>
 */
public class SelectionSort {

    private final static int[] TEST_ARRAY = {1, 0, 0, 35, 4, 47, 8, 27, 13, 9};

    private static void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = size - 1; j > i; j--) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }

    public static void main(String[] args) {
        SelectionSort.sort(TEST_ARRAY);
        for (int i : TEST_ARRAY) {
            System.out.print(i + "  ");
        }
    }
}
