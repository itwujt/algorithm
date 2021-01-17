package com.bestwu.algorithm.sorting;

/**
 * 堆排序 <br>
 *
 * 堆是具有以下性质的完全二叉树：每个节点的值都大于或等于其左右孩子节点的值，称为大顶堆
 * 或者每个节点的值都小于或等于其左右孩子节点的值，称为小顶堆。
 * @author Best Wu
 * @date 2021/1/17 14:43 <br>
 */
public class HeapSort {

    private final static int[] TEST_ARRAY = {123, 5, 75, 9, 12, 15, 6, 88, 77, 76, 75, 50};

    private static void sort(int[] arr) {
        // 创建堆
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            // 从第一个非叶子及诶单从下至上，从右至左调整结构
            adjustHeap(arr, i, arr.length);
        }
        // 调整堆结构 + 交换堆顶元素与末尾元素
        for (int i = arr.length - 1; i > 0; i--) {
            // 将堆顶元素与末尾元素进行交换
            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            // 重新调整堆
            adjustHeap(arr, 0, i);
        }
    }

    /**
     * 调整堆
     * @param arr 待排序序列
     * @param parent 父节点
     * @param length 待排序列尾元素索引
     */
    private static void adjustHeap(int[] arr, int parent, int length) {
        // 将 tmp 作为父节点
        int tmp = arr[parent];
        // 左孩子
        int lChild = 2 * parent + 1;

        while (lChild < length) {
            // 右孩子
            int rChild = lChild + 1;
            // 如果有右孩子节点，并且右孩子节点的值大于左孩子节点，则选取右孩子节点
            if (rChild < length && arr[lChild] < arr[rChild]) {
                lChild++;
            }
            // 如果父节点的值已经大于孩子节点的值，则直接结束
            if (tmp >= arr[lChild]) {
                break;
            }
            // 把孩子结点的值赋给父结点
            arr[parent] = arr[lChild];
            // 选取孩子节点的左孩子节点，继续向下筛选
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        arr[parent] = tmp;
    }

    public static void main(String[] args) {
        HeapSort.sort(TEST_ARRAY);
        for (int i : TEST_ARRAY) {
            System.out.print(i + "  ");
        }
    }

}
