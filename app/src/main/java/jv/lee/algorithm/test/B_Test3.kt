package jv.lee.algorithm.test

/**
 * @author jv.lee
 * @date 2021/6/2
 * @description
 */
object B_Test3 {
    @JvmStatic
    fun selectionSort(array: IntArray): IntArray {
        var temp: Int
        var min: Int
        for (i in array.indices) {
            min = i
            for (j in 1 + i until array.size) {
                if (array[min] > array[j]) {
                    min = j
                }
            }
            temp = array[min]
            array[min] = array[i]
            array[i] = temp
        }
        return array
    }
}