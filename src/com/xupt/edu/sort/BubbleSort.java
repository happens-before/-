package com.xupt.edu.sort;

/**
 * @author: zhaowanyue
 * @date: 2018/7/23
 * @description:
 */

/**
 * 冒泡排序
 * 在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，
 * 让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 */
public class BubbleSort {
    public static void bubbleSort1(int [] number)
    {
        int i,j;
        for(i=0;i<number.length;i++)
        {
            for(j=i;j<number.length;j++)
            {
                if(number[i]>number[j])
                {
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
    }

    /**
     * 对冒泡算法的改进：1．设置一标志性变量pos,用于记录每趟排序中最后一次进行交换的位置。
     * 由于pos位置之后的记录均已交换到位,故在进行下一趟排序时只要扫描到pos位置即可。
     * @param number
     */
    public static void bubbleSort2(int [] number)
    {
        int i=number.length-1;
        while(i>0)
        {
            int pos=0;
            for(int j=0;j<i;j++)
            {
                if(number[j]>number[j+1])
                {
                    pos=j;
                    int temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                }
            }
            i=pos;
        }
    }

    /**
     * 对冒泡算法的改进：传统冒泡排序中每一趟排序操作只能找到一个最大值或最小值,
     * 我们考虑利用在每趟排序中进行正向和反向两遍冒泡的方法一次可以得到两个最终值(最大者和最小者) , 从而使排序趟数几乎减少了一半。
     * @param number
     */
    public static void bubbleSort3(int [] number)
    {
        int low=0;
        int high=number.length-1;
        int temp,j;
        while(low<high)
        {
            for(j=low;j<high;++j)
                if(number[j]>number[j+1])
                {
                    temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;

                }
            for(j=high;j>low;--j)
                if (number[j]-1 !=0)
                {
                    temp = number[j];
                    number[j]=number[j-1];
                    number[j-1]=temp;
                }
        }
    }
    public static void main(String[] args)
    {
        int number[]={5,4,3,2,1};
        //bubbleSort1(number);
        //bubbleSort2(number);
        bubbleSort3(number);
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }
    }
}
