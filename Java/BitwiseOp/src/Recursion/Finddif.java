package Recursion;

import java.util.Scanner;

public class Finddif {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
        System.out.println(solve(s, t));
    }

    private static int solve(String s, String t) {
            int l1 = t.length();
            int sum = 0;
            char ch,ch1;
            if(l1 == 1)
                return t.charAt(0);

            for(int i =0; i< l1 -1 ; i++ ){
                ch = s.charAt(i);
                ch1 = t.charAt(i);
                sum += t.charAt(i) - s.charAt(i);
                if(i == l1-2)
                    sum += t.charAt(i + 1);
            }
            return sum;
        }
}
