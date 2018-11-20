package com.company;

public class InPlaceSorts
{
    public static String[] randStringArr(int count)
    {
        String[] arr = new String[count];
        while (count > 0)
        {
            int i = 0;
            String str = "";
            while (i < count)
            {
                char c = (char) ((Math.random()*26)+97);
                str = str + c;
                i++;
            }
            count--;
            arr[count] = str;
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
    public static void mergeSort(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0, n-1, temp);
    }
    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }
    public static void merge(int[] elements, int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to)
        {
            if (elements[i] < elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }
    }
}
