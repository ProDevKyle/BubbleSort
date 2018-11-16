package com.company;

public class Runner
{
    public static void main(String[] args)
    {
        String[] array1 = InPlaceSorts.randStringArr(10);
        long time = System.nanoTime();
        InPlaceSorts.bubbleSort(array1);
        InPlaceSorts.makeString(array1);
        time = System.nanoTime() - time;
        System.out.println("Time Taken: " + time);

        double[] array2 = InPlaceSorts.randDoubleArr(10);
        long time2 = System.nanoTime();
        InPlaceSorts.selectionSort(array2);
        InPlaceSorts.makeDouble(array2);
        time2 = System.nanoTime() - time;
        System.out.println("Time Taken: " + time);

        int[] array3 = InPlaceSorts.randIntArr(10);
        long time3 = System.nanoTime();
        InPlaceSorts.insertionSort(array3);
        InPlaceSorts.makeInt(array3);
        time3 = System.nanoTime() - time;
        System.out.println("Time Taken: " + time);
    }
}
