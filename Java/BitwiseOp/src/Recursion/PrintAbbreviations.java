package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAbbreviations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        solution(s);
    }

    private static void solution(String s) {
        String[] arr = new String[(1<<s.length())];
        for(int i = 0; i< (1<<s.length()); i++) {// shift the equivalent to 2 raised to power something
            StringBuilder sb = new StringBuilder();
            int c = 0;
            for (int j = 0; j < s.length(); j++) { // Iterate over every character in the string
                int bit = s.length() - 1 - j; //
                char ch = s.charAt(j);
                if ((i & (1 << bit)) == 0) { // if it is zero just append the character
                    if (c == 0) { // if count is zero, append the character
                        sb.append(ch);
                    } else { //else append count first then ch then reset c to 0
                        sb.append(c);
                        sb.append(ch);
                        c = 0;
                    }
                } else { //if the bit is 1, then just increase the count
                    c++;
                }
                if (c > 0) { // if anything is still left append it to the countc
                    sb.append(c);
                }
            }
                System.out.println(sb);
        }
    }
}
