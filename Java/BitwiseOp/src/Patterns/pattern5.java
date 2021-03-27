package Patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n;

        while(c > -1) {
            for (int j=n; j > c;j--){
                System.out.print(' ');
            }
            for (int i = 1; i <= c; i++) {
                System.out.print('*');
            }
            c--;
            System.out.println();
        }
    }
}
