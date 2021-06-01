package jv.lee.algorithm.core

/**
 * @author jv.lee
 * @date 2021/6/1
 * @description
 */
object B_SelectionSort {

    @JvmStatic
    fun main(args: Array<String>) {
        println(selectionSort(intArrayOf(4, 5, 67, 567, 63, 234, 546, 234, 23)).toList())
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
            println(array.toList())
        }

        return array
    }

}