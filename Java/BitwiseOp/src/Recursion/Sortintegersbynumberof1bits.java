package Recursion;

import java.util.*;

/*
Given an integer array arr.
You have to sort the integers in the array
in ascending order by the number of 1's in their binary representation
and in case of two or more integers have
the same number of 1's you have to sort them in ascending order.
Return the sorted array.
 */
public class Sortintegersbynumberof1bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i< n; i++)
            arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(solve(arr)));
    }

    private static int[] solve(int[] arr) {
        int  n =arr.length;
        int aux[] = new int[n];
        for (int i = 0; i < n; i++)
            aux[i] = count (arr[i]);

        // Sort arr[] according
        // to values in aux[]
        insertionSort(arr, aux, n);
            return arr;}
    static void insertionSort(int arr[],
                              int aux[], int n)
    {
        for (int i = 1; i < n; i++)
        {
            // use 2 keys because we
            // need to sort both
            // arrays simultaneously
            int key1 = aux[i];
            int key2 = arr[i];
            int j = i - 1;

        /* Move elements of arr[0..i-1]
        and aux[0..i-1], such that
        elements of aux[0..i-1] are
        greater than key1, to one
        position ahead of their current
        position */
            while (j >= 0 && aux[j] < key1)
            {
                aux[j + 1] = aux[j];
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            aux[j + 1] = key1;
            arr[j + 1] = key2;
        }
    }


    private static int count(int val) {
        int c = 0;
        while (val>0) {
            c = c + 1;
            val &= val - 1;
        }
        return c;
    }
}
