package Patterns;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1, cst = 2,csp = 2 * (n) - 3 ;

        while (row <= n) {
            for (int ccst = 1; ccst <= cst; ccst++ ){
                while(ccst <= cst/2){
                    System.out.print('*');
                    ccst++;
                }
                for(int ccsp = 1; ccsp <= csp; ccsp++){
                    System.out.print(' ');
                }
                while(ccst<=cst){
                    if(ccst!=10){
                    System.out.print('*');
                    ccst++;}
                }
                System.out.println();
            }

            cst+=2;
            csp-=2;
            row+=1;
//            if(row > n)
//                break;
        }

    }
}
