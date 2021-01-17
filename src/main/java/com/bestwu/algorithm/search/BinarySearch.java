package com.bestwu.algorithm.search;

import com.bestwu.algorithm.sorting.QuickSort;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 二分查找 <br>
 * 也叫折半查找，分为递归和非递归两种算法
 *
 * 执行 二分查找的前提是序列有序
 * @author Best Wu
 * @date 2021/1/17 16:09 <br>
 */
public class BinarySearch {

    private final static int[] TEST_ARRAY = {99, 12, 50, 35, 4, 56, 26, 78, 100, 44};

    /**
     * 因为在使用折半查找时，序列需要是有序的，所以在未确定序列是否有序之前
     * 需要使用排序将其置为有序状态，这里我选择使用 快速排序的方式来做，因为测试代码
     * 序列中的数据不多，如果在亿级数据的情况下，使用归并排序，时间复杂度要小
     */
    private static void sort(int[] arr) {
        Class<QuickSort> sortClazz = QuickSort.class;
        try {
            Method sort = sortClazz.getDeclaredMethod("sort", int[].class, int.class, int.class);
            sort.setAccessible(true);
            sort.invoke(null, arr, 0, arr.length - 1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 非递归实现
     * @param arr 有序序列
     * @return 索引
     */
    private static int nonRecursiveSearch(int[] arr, int element) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("array must not be empty");
        }
        BinarySearch.sort(arr);
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == element) {
                // 如果等于中间值直接返回索引 mid
                return mid;
            } else if (element < arr[mid]) {
                // 如果元素在 中间值的左边，那么将 end 调整为 mid - 1 的位置
                end = mid - 1;
            } else {
                // element > arr[mid]
                // 如果元素在 中间值的右边，那么将 start 调整为 mid + 1 的位置
                start = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int index = BinarySearch.nonRecursiveSearch(TEST_ARRAY, 78);
        for (int i : TEST_ARRAY) {
            System.out.print(i + "   ");
        }
        System.out.println();
        System.out.println(index);
    }
}
