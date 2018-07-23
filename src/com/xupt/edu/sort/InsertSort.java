package com.xupt.edu.sort;

/**
 * @author: zhaowanyue
 * @date: 2018/7/23
 * @description:
 */

/**
 * 所谓插入排序法，就是检查第i个数字，如果在它的左边的数字比它大，进行交换，这个动作一直继续下去，
 * 直到这个数字的左边数字比它还要小，就可以停止了。
 * 插入排序法主要的回圈有两个变数：i和j，每一次执行这个回圈，就会将第i个数字放到左边恰当的位置去。
 */
public class InsertSort {
    public static void insertSort(int number[])
    {
        int i, j;
        int insertNode;// 要插入的数据
        // 从数组的第二个元素开始循环将数组中的元素插入
        for (i = 1; i < number.length; i++) {
            // 设置数组中的第2个元素为第一次循环要插入的数据
            insertNode = number[i];
            j = i - 1;
            // 如果要插入的元素小于第j个元素，就将第j个元素向后移
            while ((j >= 0) && insertNode < number[j]) {
                number[j + 1] = number[j];
                j--;
            }
            // 直到要插入的元素不小于第j个元素,将insertNote插入到数组中
            number[j + 1] = insertNode;
        }
    }
    public static void main(String[] args)
    {
        int number[]={5,4,3,2,1};
        insertSort(number);
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }
    }
}
