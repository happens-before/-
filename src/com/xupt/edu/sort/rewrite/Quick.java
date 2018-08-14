package com.xupt.edu.sort.rewrite;

/**
 * @author: zhaowanyue
 * @date: 2018/8/14
 * @description:
 */
public class Quick {
    public void sort(int []array,int left,int right)
    {
        int i=left;
        int j=right;
        int x=array[left];
        while(i<j)
        {
            while(i<j && array[j]>x)
                j--;
            array[left]=array[j];
            while(i<j && array[i]<x)
                i++;
            if(i<j)
            {
                array[i]=array[i]^array[j];
                array[j]=array[i]^array[j];
                array[i]=array[i]^array[j];
            }
        }
        array[i]=x;
        if (left < j) {
            // 递归排序游标的左边
            sort(array, left, j - 1);
        }
        if (i < right) {
            // 递归排序游标的右边
            sort(array, left + 1, right);
        }
    }
    public static void main(String[] args) {
        int number[]={5,8,3,2,1};
        new Quick().sort(number,0,number.length-1);
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }
    }
}
