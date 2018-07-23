package com.xupt.edu.sort;

/**
 * @author: zhaowanyue
 * @date: 2018/7/23
 * @description:
 */
public class SelectSort {
    public static void selectSort(int number[])
    {
        int i,j;
        for(i=0;i<number.length;i++)
        {
            int min=i;
            for(j=i+1;j<number.length;j++)
            {
                if(number[j]<number[min])
                    min=j;
                if(i-min!=0)
                {
                    int temp=number[min];
                    number[min]=number[i];
                    number[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int number[]={5,4,3,2,1};
        selectSort(number);
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }
    }
}
