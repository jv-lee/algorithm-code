package jv.lee.algorithm.test

/**
 * @author jv.lee
 * @date 2021/6/2
 * @description
 */
object A_Test3 {
    fun bubbleSort(array: IntArray): IntArray {
        var temp: Int
        for (i in array.indices) {
            for (j in 1 until array.size - i) {
                if (array[j - 1] > array[j]) {
                    temp = array[j]
                    array[j] = array[j - 1]
                    array[j - 1] = temp;
                }
            }
        }
        return array
    }
}