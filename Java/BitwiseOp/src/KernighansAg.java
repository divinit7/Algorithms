import java.util.Scanner;
// Two approaches:
//1. and with the number less than this number so as to turn it to zero
// 2. Calculate rsbm and set x to x - rsbm an increment counter
public class KernighansAg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        while (n > 0) {
            c++;
            n = n & n - 1;
//            rsbm = -n & n;
//            n -= rsbm;
        }
        System.out.println(c);
    }
}
