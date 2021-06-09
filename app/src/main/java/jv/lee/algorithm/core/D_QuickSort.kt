package jv.lee.algorithm.core

/**
 * @author jv.lee
 * @date 2021/6/9
 * @description
 */
object D_QuickSort {

    @JvmStatic
    fun main(args: Array<String>) {
        println(quickSort(intArrayOf(9, 7, 8, 3, 4, 5, 6, 7, 4, 2, 7, 1), 0, 11).toList())
    }

    private fun quickSort(array: IntArray, left: Int, right: Int): IntArray {
        if (left < right) {
            val flag = partition(array, left, right)
            quickSort(array, left, flag - 1)
            quickSort(array, flag + 1, right)
        }
        return array
    }

    private fun partition(array: IntArray, left: Int, right: Int): Int {
        var index = left + 1
        for (i in index..right) {
            if (array[left] > array[i]) {
                exchange(array, i, index)
                index++
            }
        }
        exchange(array, left, index - 1)
        return index - 1
    }

    private fun exchange(array: IntArray, a: Int, b: Int) {
        val temp = array[a]
        array[a] = array[b]
        array[b] = temp
    }

}