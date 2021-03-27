package Recursion;

import java.util.Scanner;
//If N is even  do n/2 else n-1 or n+1 whichever leads to lesser number of steps
// Assume even numbers be of type 4x and 4x +2 while odd numbers are 4x+1 and 4x+3 exception 3 which even though is 4x+3 form
// results in a subtraction instead of addition

public class Reduceto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(solution(n));
    }

    private static int solution(long n) {
        int  c = 0;
        while(n!=1) {
            if (n % 2 == 0 ) {
                c++;
//                System.out.println("EVEn");
                n = n >> 1;
            }
            else if(n==3){
                c++;
//                System.out.println("Three");
                n = n-1;
            }
            else if (n % 4 == 1 ){
                c++;
//                System.out.println("4x+1");
                n = n - 1;
            }
            else if (n % 4 == 3 ){
                c++;
//                System.out.println("4x+3");
                n = n + 1;
            }

        }
        return c;

    }

}
