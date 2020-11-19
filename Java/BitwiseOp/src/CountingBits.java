import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {
    public static int[] countBits(int num) {
        int[] lis = new int[num + 1];
        int n, c = 0;

        for (int i = 0; i < num; i++) {
            c = 0;
            n = i;
            while (n>0) {
                c = c + 1;
                n &= n - 1;
            }
            lis[i] = c;
        }
            return lis;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(countBits(n)));
    }
}
