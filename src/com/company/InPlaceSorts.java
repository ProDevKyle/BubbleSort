package com.company;

public class InPlaceSorts
{
    public static String[] randStringArr(int count)
    {
        String[] arr = new String[count];
        for(int i = 0; i < arr.length; i++)
        {
            String[] dictionary = {"this", "that", "the", "was", "for", "ton", "tare", "with", "they", "be", "at", "one", "have", "this", "from", "by", "hot", "word", "but", "what", "some", "is", "it", "you", "or", "had", "the", "of", "to", "and", "in", "we", "can", "out", "other", "were", "which", "do", "their", "time", "if", "will", "how", "said", "an", "each", "tell", "does", "set", "three", "want", "air", "well", "also", "play", "small", "end", "put", "home", "read"};
            int j = (int)(Math.random()*60);
            arr[i] = dictionary[j];
        }
        return arr;
    }
    public static double[] randDoubleArr(int count)
    {
        double[] arr = new double[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (Math.random()*100);
        }
        return arr;
    }
    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }
    public static void swapString(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swapDouble(double[] arr, int i, int j)
    {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swapInt(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(String[] arr)
    {
        int swaps = 1;
        while (swaps != 0)
        {
            swaps = 0;
            for (int i = 0; i < arr.length-1; i ++)
            {
                if (arr[i].compareTo(arr[i+1]) > 0)
                {
                    swapString(arr, i, i+1);
                    swaps++;
                }
            }
        }
    }
    public static void selectionSort(double[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                    swapDouble(arr, i, j);
            }
        }
    }
    public static void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int num = arr[i];
            int j;
            for (j = i-1; j >= 0 && num < arr[j]; j--)
            {
                arr[j+1] = arr[j];
            }
            arr[j+1] = num;
        }
    }
    public static void makeString(String[] arr)
    {
        String str = "";
        for (int i = 0; i < arr.length; i++)
        {
            str = str + arr[i] + " ";
        }
        System.out.println(str);
    }
    public static void makeDouble(double[] arr)
    {
        String str = "";
        for (int i = 0; i < arr.length; i++)
        {
            str = str + arr[i] + " ";
        }
        System.out.println(str);
    }
    public static void makeInt(int[] arr)
    {
        String str = "";
        for (int i = 0; i < arr.length; i++)
        {
            str = str + arr[i] + " ";
        }
        System.out.println(str);
    }
}
