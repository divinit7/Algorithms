package Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num_rows = 2 * n-1, nst =1, row =1;
        while(row<= num_rows){
            int cst = 1;
            while(cst <= nst){
                System.out.print('*');
                cst++;
            }
            System.out.println();
            if(row <= num_rows/2){
                nst +=1;
            }
            else{
                nst -=1;
            }
                row +=1;

        }
    }
}
