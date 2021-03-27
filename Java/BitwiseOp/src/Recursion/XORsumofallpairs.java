package Recursion;

import java.util.Scanner;

public class XORsumofallpairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int xorsum = 0;
        for(int val:arr){
            xorsum ^= (2*val);
        }
        return xorsum;
    }
}
