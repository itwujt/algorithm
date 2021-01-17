package com.bestwu.algorithm.sorting;

/**
 * 快速排序 <br>
 * 从数列中选出一个元素，作为 “基准”
 * 重新排序数列，所有元素比基准值小的摆放在基准值前面，所有元素比基准值大的摆在基准的后面
 * （相同的数要么全部放在左边，要么全部放在右边）
 * 在这个分隔之后，该基准是它的最后位置。这个称为分割（partition）操作。
 * 递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。
 * @author Best Wu
 * @date 2021/1/16 21:11 <br>
 */
public class QuickSort {

    private final static int[] TEST_ARRAY = {23, 15, 98, 64, 52, 31, 20, 20, 0, 18};

    private static void sort(int[] arr, int left, int right) {
       // 1.选择数组中间的位置的元素作为基准值
        int mid = (left + right) / 2;
        int pivot = arr[mid];
        // 2.初始化左右指针的位置
        int leftPoint = left;
        int rightPoint = right;
        while (leftPoint < rightPoint) {
            // 3. 如果左指针指向的元素值小于基准值，并且左指针位置在中间位置之前
            while (arr[leftPoint] <= pivot && leftPoint < mid) {
                // 4. 左指针右移一位
                leftPoint++;
            }
            // 5.如果发现左指针指向的元素值大于基准值
            if (leftPoint < mid) {
                // 6.则将左指针指向的元素赋值给中间位置
                arr[mid] = arr[leftPoint];
                // 7.将左指针位置赋值给中间位置
                mid = leftPoint;
            }
            // 8.与左指针同理，下面是右指针的逻辑
            while (arr[rightPoint] > pivot && rightPoint > mid) {
                rightPoint--;
            }
            if (rightPoint > mid) {
                arr[mid] = arr[rightPoint];
                mid = rightPoint;
            }
        }
        // 9.leftPoint 与 rightPoint 重合，把基准值给中间元素
        arr[mid] = pivot;
        // 10.分别对左右两边的分组再次分组，使用递归
        if (mid - left > 1) {
            sort(arr, left, mid - 1);
        }
        if (right - mid > 1) {
            sort(arr, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        QuickSort.sort(TEST_ARRAY, 0, TEST_ARRAY.length - 1);
        for (int i : TEST_ARRAY) {
            System.out.print(i + "  ");
        }
    }

}






