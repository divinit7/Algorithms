package Recursion;

import java.util.Scanner;

public class Multipleof4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isMultipleOf4(n);
        isPowerOfFour(n);

    }
    static boolean isPowerOfFour(int num) {
        if(num==1) return true;
        boolean containsSingleSetBit=(num&(num-1))==0;
        boolean fourOrSixInZerothPlace=num%10==4||num%10==6;

        return containsSingleSetBit && fourOrSixInZerothPlace;
    }
    // Returns true if n is a multiple of 4.
    static boolean isMultipleOf4(long n)
    {
        if (n==0)
            return true;

        return (((n>>2)<<2) == n);
    }
}
