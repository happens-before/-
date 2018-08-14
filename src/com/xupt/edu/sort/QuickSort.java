package com.xupt.edu.sort;

/**
 * @author: zhaowanyue
 * @date: 2018/7/23
 * @description:
 */

import java.util.HashMap;

/**
 * 快速排序
   快排最主要的思维就是寻找一个分界值，大的放在一边，小的放在一边，然后递归分别处理大的和小的，
   这里需要注意的是我们在移动游标是需要的是加上等于分界的值，否则的话如果有相等的值就会进入死循环，
   很简单的来说，当以一个数为分界值的时候，那么另一个和他相同的数如果没有到边界是不会移动的
   ，但是无论是大的还是小的递归完成以后就一定会挨着分界值。
 */
public class QuickSort {

    private static void quickSort(int[] a, int begin, int end) {
        //
        int tbegin = begin, tend = end;
        // 将第一个值作为快排序的分界值
        int pivot = a[begin];
        while (tbegin < tend) {
            // 如果两个游标没有交集，或者后面一直大于或等于分界值就一直向前移动
            while (tbegin < tend && a[tend] >= pivot) {
                --tend;
            }
            a[tbegin] = a[tend];
            // 如果两个游标没有交集，或者前面是小于或等于分界值，就一直向后头移动
            while (tbegin < tend && a[tbegin] <= pivot) {
                ++tbegin;
            }
            a[tend] = a[tbegin];

        }
        // 将临界值赋值给游标的交集的地方
        a[tbegin] = pivot;
        if (begin < tend) {
            // 递归排序游标的左边
            quickSort(a, begin, tend - 1);
        }
        if (tbegin < end) {
            // 递归排序游标的右边
            quickSort(a, tbegin + 1, end);
        }

    }

    public static void main(String[] args)
    {
        int number[]={5,4,3,2,1};
        quickSort(number,0,number.length-1);
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }
    }
}
