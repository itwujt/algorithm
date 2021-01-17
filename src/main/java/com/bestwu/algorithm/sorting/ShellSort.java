package com.bestwu.algorithm.sorting;

/**
 * 希尔排序 <br>
 * 希尔排序的基本思想是：将数组列在一个表中并对列分别进行插入排序，重复这过程，
 * 不过每次用更长的列（步长更长了，列数更少了）来进行。最后整个表就只有一列了。
 * 将数组转换至表就只有一列了。
 * 将数组转换至表是为了更好地理解这算法，算法本身还是使用数组进行排序的。
 *
 * e.g. 一组数 [13, 14, 94, 33, 82, 25, 59, 94, 65, 23, 45, 27, 73, 25, 39, 10]
 * 如果我们以步长为 5 开始进行排序，我们可以通过将这列表放在有 5 列的表中来更好地描述算法，
 * 这样他们就应该看起来是这样 （竖着的元素是步长组成）：
 *
 * 13  14  94  33  82
 * 25  59  94  65  23
 * 45  27  73  25  39
 * 10
 * 然后对每列进行排序：
 * 10  14  73  25  23
 * 13  27  94  33  39
 * 25  59  94  65  82
 * 45
 * 将上述四行数字，依序接在一起时我们得到：[10, 14, 73, 25, 23, 13, 27, 94, 33, 39, 25, 59, 94, 65, 82, 45]
 * 这时 10 已经移至正确位置了，然后再以 3 为步长进行排序
 * 10  14  73
 * 25  23  13
 * 27  94  33
 * 39  25  59
 * 94  65  82
 * 45
 * 排序之后变为：
 * 10  14  13
 * 25  23  33
 * 27  25  59
 * 39  65  73
 * 45  94  82
 * 94
 *
 * 最后以 1 步长进行排序（此时就是简单的插入排序了）
 *
 * @author Best Wu
 * @date 2021/1/17 13:36 <br>
 */
public class ShellSort {

    private final static int[] TEST_ARRAY = {13, 14, 94, 33, 82, 25, 59, 94, 65, 23, 45, 27, 73, 25, 39, 10};

    private static void sort(int[] arr) {
        int size = arr.length;
        int gap = size / 2;
        while (gap > 0) {
            for (int j = gap; j < size; j++) {
                int i = j;
                while (i >= gap && arr[i - gap] > arr[i]) {
                    int tmp = arr[i - gap] + arr[i];
                    arr[i - gap] = tmp - arr[i - gap];
                    arr[i] = tmp - arr[i - gap];
                    i -= gap;
                }
            }
            gap = gap / 2;
        }
    }

    public static void main(String[] args) {
        ShellSort.sort(TEST_ARRAY);
        for (int i : TEST_ARRAY) {
            System.out.print(i + "  ");
        }
    }
}
