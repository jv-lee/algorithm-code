package jv.lee.algorithm.core

import jv.lee.algorithm.test.B_Test
import jv.lee.algorithm.test.B_Test2
import jv.lee.algorithm.test.B_Test3

/**
 * @author jv.lee
 * @date 2021/6/1
 * @description
 * 选择排序是一种简单直观的排序算法。
 * 它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 以此类推，直到所有元素均排序完毕。
 */
object B_SelectionSort {

    @JvmStatic
    fun main(args: Array<String>) {
        println(selectionSort(intArrayOf(4, 5, 67, 567, 63, 234, 546, 234, 23)).toList())
        println(B_Test.selectionSort(intArrayOf(4, 5, 67, 567, 63, 234, 546, 234, 23)).toList())
        println(B_Test2.selectionSort(intArrayOf(4, 5, 67, 567, 63, 234, 546, 234, 23)).toList())
        println(B_Test3.selectionSort(intArrayOf(4, 5, 67, 567, 63, 234, 546, 234, 23)).toList())
    }

    fun selectionSort(array: IntArray): IntArray {
        var min: Int
        var temp: Int
        for (i in array.indices) {
            //最小值基础比较值都是当前下标的值
            min = i
            for (j in i + 1 until array.size) {
                if (array[min] > array[j]) {
                    min = j
                }
            }
            temp = array[i]
            array[i] = array[min]
            array[min] = temp
        }

        return array
    }

}