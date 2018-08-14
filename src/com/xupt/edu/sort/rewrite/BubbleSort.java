package com.xupt.edu.sort.rewrite;

/**
 * @author: zhaowanyue
 * @date: 2018/8/14
 * @description:
 */
public class BubbleSort {
    public  void sort(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    array[i]=array[i]^array[j];
                    array[j]=array[i]^array[j];
                    array[i]=array[i]^array[j];
                }
            }
        }
    }
    public static void main(String[] args) {
        int number[]={5,8,3,2,1};
        new BubbleSort().sort(number);
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }
    }
}
