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
        time2 = System.nanoTime() - time2;
        System.out.println("Time Taken: " + time2);

        int[] array3 = InPlaceSorts.randIntArr(10);
        long time3 = System.nanoTime();
        InPlaceSorts.insertionSort(array3);
        InPlaceSorts.makeInt(array3);
        time3 = System.nanoTime() - time3;
        System.out.println("Time Taken: " + time3);

        int[] array4 = InPlaceSorts.randIntArr(10);
        long time4 = System.nanoTime();
        InPlaceSorts.mergeSort(array4);
        InPlaceSorts.makeInt(array4);
        time4 = System.nanoTime() - time4;
        System.out.println("Time Taken: " + time4);

        int[] array5 = InPlaceSorts.randIntArr(10);
        long time5 = System.nanoTime();
        InPlaceSorts.quickSort(array5, 0, array5.length-1);
        InPlaceSorts.makeInt(array5);
        time5 = System.nanoTime() - time5;
        System.out.println("Time Taken: " + time5);
    }
}
