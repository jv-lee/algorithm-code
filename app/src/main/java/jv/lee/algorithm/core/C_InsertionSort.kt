package jv.lee.algorithm.core

/**
 * @author jv.lee
 * @date 2021/6/3
 * @description
 */
object C_InsertionSort {

    @JvmStatic
    fun main(args: Array<String>) {
        //0 current = 9  9 = 9 preIndex = -1
        //1 current = 7  7 = 9 preIndex = 0 -1 (-1+1 = 0) 9 = 7(current)
        //2 current = 8  9 = 8 8 = 8 preIndex = 1 0
        //7 8 9 3 4 5 6 7 4 2 7 1
        //7 8 9 3 4 5 6 7 4 2 7 1
        //3 current = 3  3 = 9 preIndex = 2 1
        println(insertionSort(intArrayOf(9, 7, 8, 3, 4, 5, 6, 7, 4, 2, 7, 1)).toList())
    }

    fun insertionSort(array: IntArray): IntArray {
        var current: Int
        var preIndex: Int
        for (i in array.indices) {
            current = array[i]
            preIndex = i - 1
            while (preIndex >= 0 && array[preIndex] > current ) {
                array[preIndex + 1] = array[preIndex]
                preIndex--
            }
            array[preIndex + 1] = current
        }
        return array
    }


}