package Recursion;

import java.util.Scanner;

public class counttriplets {
        public static int countTriplets(int[] arr) {
            int triplets = 0, xor = 0;
            int length = arr.length;
            for(int i = 0; i< length; i++){
                xor = arr[i];
                for(int j = i+1; j < length; j++){
                    xor ^= arr[j];
                    if(xor == 0)
                        triplets += j - i;
                }
            }

            return triplets;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        countTriplets(new int[]{1,2,3,4,9,5,6});
    }
    }

