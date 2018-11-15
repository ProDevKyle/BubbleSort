package com.company;

public class Runner
{
    public static void main(String[] args)
    {
        int[] array = BubbleSort.randIntArr(10);
        BubbleSort.insertionSort(array);
        BubbleSort.string(array);
    }
}
