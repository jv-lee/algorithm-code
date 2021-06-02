package jv.lee.algorithm.test;

/**
 * @author jv.lee
 * @date 2021/6/2
 * @description
 */
public class B_Test2 {

    public static int[] selectionSort(int[] array) {
        int temp;
        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = 1 + i; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
