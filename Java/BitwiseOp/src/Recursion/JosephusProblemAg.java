package Recursion;

import java.util.Scanner;
//kill every second pair in the array in a cicular format and return the last one left
// n = Math.pow(2,x) + l; find l then use 2l-1 to get the value

public class JosephusProblemAg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int l = (int) Math.log(n);
        System.out.println(2*l-1);

    }
}