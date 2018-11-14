package com.company;

public class BubbleSort
{
    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSwap(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length-1; j++)
            {
                if (arr[j] > arr[j+1])
                    swap(arr,j,j+1);
            }
        }
    }
    public static void string(int[] arr)
    {
        String str = "";
        for (int i = 0; i < arr.length; i++)
        {
            str = str + arr[i] + " ";
        }
        System.out.println(str);
    }
}
