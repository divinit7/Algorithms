package Recursion;

import java.util.Scanner;

//a number is missing but another is duplicated while all number occur once
public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();


        solution(a);
    }


    public static void solution(int[] arr) {
        int xor =0;
        for(int i=0;i< arr.length;i++)
            xor ^= arr[i]^i;
        for(int val:arr){

        }


    }
}