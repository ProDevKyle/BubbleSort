package com.company;

public class Runner
{
    public static void main(String[] args)
    {
        int[] array = BubbleSort.randIntArr(10);
        BubbleSort.bubbleSwap(array);
        BubbleSort.string(array);
    }
}
