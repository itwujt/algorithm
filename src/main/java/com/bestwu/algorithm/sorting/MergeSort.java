package com.bestwu.algorithm.sorting;

import java.util.Arrays;

/**
 * 归并排序 <br>
 * 申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
 * 设定两个指针，最初位置分别为两个已经排序序列的起始位置
 * 比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
 *
 * @author Best Wu
 * @date 2021/1/17 10:26 <br>
 */
public class MergeSort {

    private final static int[] TEST_ARRAY = {63, 100, 54, 33, 24, 8, 88, 92, 95, 66};

    /**
     * 将 arr[1...mid] 和 arr[mid + 1...right] 两部分进行归并
     * @param arr array
     * @param left
     * @param mid
     * @param right
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        // 辅助数组
        int[] tmp = new int[arr.length];
        // p1、p2 是检测指针，k 是存放指针
        int p1 = left, p2 = mid + 1, k = left;
        while (p1 <= mid && p2 <= right) {
            if (arr[p1] <= arr[p2]) {
                tmp[k++] = arr[p1++];
            } else {
                tmp[k++] = arr[p2++];
            }
        }
        // 如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
        while (p1 <= mid) {
            tmp[k++] = arr[p1++];
        }
        while (p2 <= right) {
            tmp[k++] = arr[p2++];
        }
        for (int i = left; i <= right; i++) {
            arr[i] = tmp[i];
        }
    }


    private static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        // 划分子序列
        int mid = (left + right) / 2;
        // 对左侧子序列进行递归排序
        sort(arr, left, mid);
        // 对右侧子序列进行递归排序
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void main(String[] args) {
        MergeSort.sort(TEST_ARRAY, 0, TEST_ARRAY.length - 1);
        for (int i : TEST_ARRAY) {
            System.out.print(i + "  ");
        }
    }


}
