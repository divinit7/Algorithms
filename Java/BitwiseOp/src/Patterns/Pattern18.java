package Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n/2, nsp = 1, row =1 ;
        while(row <= n){
            for(int cst = 1; cst <= nst; cst++){
                System.out.print(' ');
            }
            for(int csp = 1; csp <= nsp; csp++){
                System.out.print('*');
            }
//            for(int cst = 1; cst <= nst; cst++){
//                System.out.print(' ');
//            }
            System.out.println();
            if (row <= n/2){
                nsp += 2;
                nst -= 1;
            }
            else{
                nsp -=2;
                nst += 1;
            }
            row += 1;
        }
    }
}
