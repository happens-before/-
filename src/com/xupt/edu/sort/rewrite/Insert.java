package com.xupt.edu.sort.rewrite;

/**
 * @author: zhaowanyue
 * @date: 2018/8/14
 * @description:
 */
public class Insert {
    public void sort(int []array)
    {
        for (int i=1;i<array.length;i++)
        {
            int insertNode=array[i];
            int j=i-1;
            while(j>=0 && insertNode<array[j] )
            {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=insertNode;
        }
    }
    public static void main(String[] args) {
        int number[]={5,8,3,2,1};
        new Insert().sort(number);
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }
    }
}
