package Recursion;

import java.util.Scanner;

public class RightMostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        smdb(n);
    }


    public static void smdb(int n) {
        System.out.println(Integer.toBinaryString(n & -n));
    }
}
