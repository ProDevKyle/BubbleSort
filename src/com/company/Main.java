package com.company;

public class Main
{
    public static void main(String[] args)
    {

    }
    public static void swap (int[] arr, int i, int j)
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
                    swap(arr,j,j+1)
            }
        }
    }
}
