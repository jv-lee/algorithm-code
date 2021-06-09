package jv.lee.algorithm.test;

/**
 * @author jv.lee
 * @date 2021/6/2
 * @description 第一轮把最小得值放入第一位 之后在剩下未排序得队列里继续找到最小得排到 已排序得后面 （所以每次排序后，初始位置下次不再进入排序比较）
 */
public class B_Test2 {

    public static int[] selectionSort(int[] array) {
        int temp;
        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
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
