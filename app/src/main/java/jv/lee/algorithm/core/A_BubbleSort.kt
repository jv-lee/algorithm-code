package jv.lee.algorithm.core

import jv.lee.algorithm.test.A_Test
import jv.lee.algorithm.test.A_Test2
import jv.lee.algorithm.test.A_Test3

/**
 * @author jv.lee
 * @date 2021/6/1
 * @description 冒泡排序
 * 冒泡排序是一种简单的排序算法。
 * 它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 * 这个算法的名字由来是因为越小的元素会经由交换慢慢 “浮” 到数列的顶端。
 *
 * 冒泡排序就是双重遍历 外层按长度遍历 然后从第一个开始和后一位做比较 将较大的数值和后面的替换 所以第一次遍历会将最大的数值放置末尾
 * 第二次开始内部循环不在遍历最后一位比较，再按顺序前后比较较大的向后替换
 */
object A_BubbleSort {

    @JvmStatic
    fun main(args: Array<String>) {
        println(bubbleSort(intArrayOf(7, 6, 5, 4, 3, 2, 1)).toList())
        println(A_Test.bubbleSort(intArrayOf(7, 6, 5, 4, 3, 2, 1)).toList())
        println(A_Test2.bubbleSort(intArrayOf(7, 6, 5, 4, 3, 2, 1)).toList())
        println(A_Test3.bubbleSort(intArrayOf(7, 6, 5, 4, 3, 2, 1)).toList())
    }

    private fun bubbleSort(array: IntArray): IntArray {
        var temp: Int
        for (i in array.indices) {
            for (j in 1 until (array.size - i)) {
                if (array[j - 1] > array[j]) {
                    temp = array[j]
                    array[j] = array[j - 1]
                    array[j - 1] = temp
                }
            }
        }

        return array
    }

}