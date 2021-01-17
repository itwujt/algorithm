package com.bestwu.algorithm.search;

/**
 * 顺序查找 <br>
 *
 * @author Best Wu
 * @date 2021/1/17 16:16 <br>
 */
public class SequenceSearch {

    private final static int[] TEST_ARRAY = {123, 5, 75, 9, 12, 15, 6, 88, 77, 76, 75, 50};

    /**
     * @param arr 数列
     * @param element 要查找的元素
     * @return 索引，未找到则为 -1，找到了即为在 arr 中的索引
     */
    private static int search(int[] arr, int element) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("array must not be empty");
        }
        int index = -1;
        for (int i : arr) {
            index++;
            if (element == i) {
                return index;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int index = SequenceSearch.search(TEST_ARRAY, 77);
        System.out.println(index);
    }
}
