package jv.lee.algorithm.core

/**
 * @author jv.lee
 * @date 2021/6/1
 * @description 冒泡排序
 * 冒泡排序是一种简单的排序算法。
 * 它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 * 这个算法的名字由来是因为越小的元素会经由交换慢慢 “浮” 到数列的顶端。
 */
object A_BubbleSort {

    @JvmStatic
    fun main(args: Array<String>) {
//        println(bubbleSort(intArrayOf(7, 6, 5, 4, 3, 2, 1)).toList())
        println(A_Test.bubbleSort(intArrayOf(7, 6, 5, 4, 3, 2, 1)).toList())
    }

    private fun bubbleSort(array: IntArray): IntArray {
        var temp: Int
        for (i in array.indices) {
            //-2操作时因为每一项需要和后一位做对比 而最后一位不需要做对比 所有从0到长度-2 只对比到倒数第二位
            for (j in 0..array.size - 2) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1]
                    array[j + 1] = array[j]
                    array[j] = temp
                }
            }
        }

        return array
    }

}