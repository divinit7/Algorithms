package Patterns;

import java.util.Scanner;

public class pattern_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 1, nst = (n)/2;
        int row = 1;
        while(row <= n) {
            for(int i = 1; i<= nsp; i++){
                System.out.print('*');
                System.out.print("\t");
            }
            for (int i = 1; i <= nst; i++) {
                System.out.print("\t");
            }
            System.out.println();
            if (row <=n/2){
            nsp += 2;
            nst -= 1;
            }
            else
            if (row > n/2){
                nsp -= 2;
                nst += 1;
            }
            row++;
        }

    }
}
