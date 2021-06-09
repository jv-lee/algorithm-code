package jv.lee.algorithm.test;

/**
 * @author jv.lee
 * @date 2021/6/2
 * @description 冒泡排序把最大得一直往后移动 第一轮过后 最大值就在队列最后面 ，第二轮开始 最后一位不需要在排序
 */
public class A_Test2 {
    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
}
