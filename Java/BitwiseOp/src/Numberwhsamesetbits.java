import java.util.Arrays;
import java.util.Scanner;
//
public class Numberwhsamesetbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int setbts = cbs(n);
        System.out.println(solution(n, setbts));
    }

    public static int cbs(long n) {
        int c = 0;
        while(n > 0){
            long rsb =  n & -n;
            n -= rsb;
            rsb++;
        }
        return c;
    }

//    @Contract(pure = true)
    private static int solution(long n, int k) {
        return 0;
    }
}
