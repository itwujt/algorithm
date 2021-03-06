package com.bestwu.algorithm.sorting;

/**
 * 常见的排序方法有：<br>
 * 冒泡排序 <br>
 * <p> Bubble Sort，是一种计算机科学领域的较简单的排序算法。
 * 它重复的走过要排序的数列，一次比较两个元素，如果他们的顺序错误就把它们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，即该数列排序完成。
 * 这个算法的名字由来是因为越大的元素会经由交换慢慢“浮”到数列的顶端。
 * 时间复杂度为 O(n^2)
 *
 * 快速排序 <br>
 * <p> Quick Sort，是对冒泡排序的一种改进。它的基本思想是
 * 通过一趟排序将要排序的数列分隔为两个部分，其中一部分的所有数据都比另外一部分的所有数据都小，
 * 然后再按此方法对这两部分数列分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列
 * 时间复杂度 O(n * logn)
 *
 * 插入排序 <br>
 * <p> Insert Sort，讲一个数据插入到已经排好序的有序数列中，从而得到一个新的，个数加一的有序数列，
 * 算法适用于少量数列的排序，时间复杂度为 O(n^2)。是最稳定的排序方法。
 * 插入排序的基本思想是每步将一个待排序的记录，按其关键码值的大小插入前面已经排序的序列中适当位置上，直到全部插入完为止。
 *
 * 归并排序 <br>
 * <p> Merge Sort，归并排序是建立在归并操作上的一种有效的排序算法，该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
 * 将已有序的子序列合并，得到完全有序的序列，即先使每个子序列有序，再使子序列段间有序。
 * 若将两个有序表合并成一个有序表，称为二路归并。
 * <p> 归并排序是一种稳定的排序算法，归并排序的主要问题在于它需要一个与待排序数组一样大的辅助数组空间。
 * 由于归并排序每次划分时两个子序列的长度基本一样
 * 时间复杂度 O(n*logn)
 *
 *
 * 希尔排序 <br>
 * <p> Shell Sort，是插入排序的一种，也称缩小增量排序，是直接排序算法的一种高效的改进版本
 * 希尔排序是非常稳定的排序算法。希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序
 * 随着增量逐渐减少，每组包含的关键词越来越多，当增量减至 1 时，整个序列被分成一组，算法便终止。
 *
 *
 * 选择排序 <br>
 * <p> Selection Sort，是一种简单直观的排序算法。
 * 它的工作原理是每一次从待排序的数据元素中选出最小（或最大）的一个元素，
 * 存放在序列的起始位置，直到全部待排序的数据元素排完。选择排序是不稳定的排序方法。
 * 时间复杂度 O(n^2)
 *
 * 堆排序 <br>
 * <p> Heap Sort，是指利用堆这种数据结构所设计的一种排序算法。堆是一个近似完全二叉树的结构，
 * 并同时满足堆积的性质，即子节点的键值或索引总是小于（大于）
 *
 * @date 2021/1/16 20:26 <br>
 * @author Best Wu
 */