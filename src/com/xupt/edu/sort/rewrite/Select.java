package com.xupt.edu.sort.rewrite;

/**
 * @author: zhaowanyue
 * @date: 2018/8/14
 * @description:
 */
public class Select {
    public void sort(int []array)
    {
        for(int i=0;i<array.length;i++)
        {
            int min=i;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j]<array[i])
                {
                    if(array[j]<array[min])
                    {
                        min=j;
                    }
                }

            }
            if(min>i)
            {
                array[i]=array[i]+array[min];
                array[min]=array[i]-array[min];
                array[i]=array[i]-array[min];
            }

        }
    }
    public static void main(String[] args) {
        int number[]={5,8,3,2,1};
        new Select().sort(number);
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }
    }
}
